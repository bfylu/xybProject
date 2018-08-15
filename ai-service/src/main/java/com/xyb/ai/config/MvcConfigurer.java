package com.xyb.ai.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xyb.common.json.ResultStatus;
import com.xyb.common.util.U;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class MvcConfigurer implements WebMvcConfigurer {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    private RedisTemplateUtil redisTemplateUtil;

    private CorsConfiguration buildConfig() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedOrigin("*");
        corsConfiguration.addAllowedHeader("*");
        corsConfiguration.addAllowedMethod("*");
        return corsConfiguration;
    }

    /**
     * 跨域过滤器
     *
     * @return
     */
    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", buildConfig());
        return new CorsFilter(source);
    }

    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new SessionHandlerInterceptor())
//                .excludePathPatterns(Arrays.asList("/error", "/login**", "/swagger-resources/**", "/swagger**", "/webjars/**", "/user/**"));
//        registry.addInterceptor(new SessionHandlerInterceptor()).excludePathPatterns(Arrays.asList("/error", "/login**"));
    }

    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowCredentials(true)
                .allowedHeaders("*")
                .allowedMethods("*")
                .maxAge(3600);
    }

    public void addFormatters(FormatterRegistry registry) {
        registry.addFormatter(new DateFormatter("yyyy-MM-dd HH:mm:ss"));
    }

    /**
     * 检查用户是否已经登录，如果未登录，提示未登录
     */
    class SessionHandlerInterceptor implements HandlerInterceptor {
        /**
         * preHandle方法是进行处理器拦截用的，该方法将在Controller处理之前进行调用，
         * 当preHandle的返回值为false的时候整个请求就结束了。
         * 如果preHandle的返回值为true，则会继续执行postHandle和afterCompletion。
         */
        public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
                throws Exception {
            /*
            //用户登录时候的输入sessionToken 值
            String sessionToken = openid + ":" + java.util.UUID.randomUUID().toString();
            redisTemplateUtil.set("sessionToken:" + openid, sessionToken, 1800);  //30 * 60 = 半个小时

            例如：
                1. 用户登录时候存入reids的数据格式，如下：
                    用户名称：test1,即上面的openid = test1
                    sessionToken = test1:12345667

                    存入redis数据，set "sessionToken:test1" "test1:12345667"

               2. 在验证取出  sessionToken 数据规则是：
                先获取用户传过来的数据：sessionToken=test1:12345667
                再把该字符串拆分成二部分，以 ":" 符合分割字符串，取出第一部分数据 test1
                再查询 redis里是否有数据： get "sessionToken:test1"
                得到的数据 test1:12345667， 跟传入的数据做对比是否相等，相等就合法，否则不让进入
            */

            String url = request.getRequestURI();
            log.info("Interceptors Url:" + url);

            String sessionToken = request.getParameter("sessionToken");
            log.info("Interceptors sessionToken:" + sessionToken);

            String sessionTokenKey = "";
            if (U.isNotBlank(sessionToken)) {
                sessionTokenKey = checkSessionTokenAndGet(sessionToken);
            }
            log.info("Interceptors sessionTokenKey:" + sessionTokenKey);

            //如果没有token数据就提示未登陆
            if (U.isBlank(sessionToken) || U.isBlank(sessionTokenKey)) {
                //未登录
                Map mapError = new HashMap();
                mapError.put("code", ResultStatus.no_login.getErrorCode());
                mapError.put("message", ResultStatus.no_login.getErrorMsg());
                mapError.put("data", "");
                mapError.put("currentTime", System.currentTimeMillis());

                writeJson(response, mapError);

                return false;
            }

            // 刷新超时时间
            redisTemplateUtil.expire(sessionTokenKey, 1800);
            return true;
        }
    }

    private String checkSessionTokenAndGet(String strSessionToken) {
        String sessionTokenKey = "";

        if (strSessionToken.length() > 0) {
            String token = "";
            String openid = "";
            try {
                String[] aryToken = strSessionToken.split(":");
                openid = aryToken[0];
                Object objToken = redisTemplateUtil.get("sessionToken:" + openid);
                if (objToken != null) {
                    token = objToken.toString();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            if (token.equals(strSessionToken)) {
                sessionTokenKey = "sessionToken:" + openid;
            }
        }
        return sessionTokenKey;
    }

    private void writeJson(HttpServletResponse response, Map mapError) {
        response.setContentType("application/json;charset=utf-8");
        try {
            response.getWriter().write(objectMapper.writeValueAsString(mapError));
        } catch (IOException e) {
            // ignore
        }
    }
}
