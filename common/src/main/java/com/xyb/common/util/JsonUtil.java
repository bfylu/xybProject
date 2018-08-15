package com.xyb.common.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.xyb.common.PageInfo;
import com.xyb.common.PageList;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JsonUtil {

    private static final ObjectMapper BASIC = new BasicObjectMapper();

    /**
     * 用来渲染给前台的 json 映射器, 定义了一些自定义类的序列化规则, 没有反序列化规则
     */
    public static final ObjectMapper RENDER = new RenderObjectMapper();

    private static class BasicObjectMapper extends ObjectMapper {
        private static final long serialVersionUID = -4643111309141017992L;

        private BasicObjectMapper() {
            super();
            // 时间格式. 此处只能统一处理, 好的方式还是应该用默认的: 返回时间戳, 具体显示成何种格式由 app 及 前端自己处理
            // setDateFormat(new SimpleDateFormat(DateFormatType.YYYY_MM_DD_HH_MM_SS.getValue()));
            // 不确定值的枚举返回 null
            configure(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL, true);
            // 不确定的属性项上不要失败
            configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            // 提升序列化性能, map 中的 null 值不序列化
            configure(SerializationFeature
                    .WRITE_NULL_MAP_VALUES, false);
            // 提升序列化性能, null 值不序列化
            // setSerializationInclusion(JsonInclude.Include.NON_NULL);

            // 金额如果为空, 返回 0.00 给前端. 否则按全局的精度返回字符串给前端
            registerModule(new SimpleModule().addSerializer(BigDecimal.class, new JsonSerializer<BigDecimal>() {
                @Override
                public void serialize(BigDecimal value, JsonGenerator gen, SerializerProvider serializers) throws IOException, JsonProcessingException {
                    if (value == null) {
                        gen.writeObject(nilMoney().toString());
                    } else {
                        gen.writeObject(precision(value).toString());
                    }
                }
            }));
        }
    }

    private static final int SCALE = 7;

    /**
     * 设置金额的精度. 保留两位小数点
     */
    public static BigDecimal precision(BigDecimal money) {
        // + ==> add
        // - ==> subtract
        // * ==> multiply
        // / ==> divide 除法调用下面的方法
        return U.isBlank(money) ? money : money.setScale(SCALE, BigDecimal.ROUND_HALF_EVEN);
    }

    /**
     * 当金额为空时返回的默认金额
     */
    public static BigDecimal nilMoney() {
        return precision(BigDecimal.ZERO);
    }

    private static class RenderObjectMapper extends BasicObjectMapper {
        private static final long serialVersionUID = 7806972332679655980L;

        private RenderObjectMapper() {
            super();
            // 序列化 PageList 时只将总条数和当前页的数据返回. 否则可以使用 PageListJsonSerializer 这个现成的实现
            // registerModule(new SimpleModule().addSerializer(new PageListJsonSerializer(this)));
            registerModule(new SimpleModule().addSerializer(PageList.class, new JsonSerializer<PageList>() {
                @Override
                @SuppressWarnings("unchecked")
                public void serialize(PageList value, JsonGenerator gen, SerializerProvider sp) throws IOException {
                    gen.writeObject(A.maps(
                            "items", new ArrayList<>(value),
                            "total", value.getTotal()
                    ));
                }
            }));
        }
    }

    /**
     * 将 source 对象转换成 clazz 类的一个实例, 失败将会返回 null
     */
    public static <S, T> T convert(S source, Class<T> clazz) {
        return U.isBlank(source) ? null : toObjectNil(toJson(source), clazz);
    }

    /**
     * 将集合 sourceList 转换成 clazz 类的实例集合, 失败将会返回 null
     */
    public static <S, T> List<T> convertList(List<S> sourceList, Class<T> clazz) {
        return A.isEmpty(sourceList) ? Collections.emptyList() : toListNil(toJson(sourceList), clazz);
    }


    public static <S, T> PageInfo convert(PageInfo<S>  source, Class<T> clazz) {
        if(U.isBlank(source)) { return  null; }

        PageInfo<T> pageInfoVo = new PageInfo<>();
        pageInfoVo.setIsFirstPage(source.isIsFirstPage());
        pageInfoVo.setIsLastPage(source.isIsLastPage());
        pageInfoVo.setPageNum(source.getPageNum());
        pageInfoVo.setPages(source.getPages());
        pageInfoVo.setPageSize(source.getPageSize());
        pageInfoVo.setTotal(source.getTotal());

        return pageInfoVo;
    }

    /**
     * 对象转换成 json 字符串
     */
    public static String toJson(Object obj) {
        return toJson(BASIC, obj);
    }

    private static String toJson(ObjectMapper om, Object obj) {
        try {
            return om.writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException("object(" + obj + ") to json exception.", e);
        }
    }

    /**
     * 对象转换成 json 字符串, 主要用来渲染到前台
     */
    public static String toRender(Object obj) {
        return toJson(RENDER, obj);
    }

    /**
     * 将 json 字符串转换为对象
     */
    public static <T> T toObject(String json, Class<T> clazz) {
        try {
            return BASIC.readValue(json, clazz);
        } catch (Exception e) {
            throw new RuntimeException("json (" + json + ") to object(" + clazz.getName() + ") exception", e);
        }
    }

    /**
     * 将 json 字符串转换为对象, 当转换异常时, 返回 null
     */
    public static <T> T toObjectNil(String json, Class<T> clazz) {
        try {
            return BASIC.readValue(json, clazz);
        } catch (Exception e) {
            if (LogUtil.ROOT_LOG.isErrorEnabled()) {
                LogUtil.ROOT_LOG.error(String.format("json(%s) to class(%s) exception", json, clazz), e);
            }
            return null;
        }
    }

    /**
     * 将 json 字符串转换为指定的数组列表
     */
    public static <T> List<T> toList(String json, Class<T> clazz) {
        try {
            return BASIC.readValue(json, BASIC.getTypeFactory().constructCollectionType(List.class, clazz));
        } catch (Exception e) {
            throw new RuntimeException("json(" + json + ") to list(" + clazz.getName() + ") exception.", e);
        }
    }

    /**
     * 将 json 字符串转换为指定的数组列表
     */
    public static <T> List<T> toListNil(String json, Class<T> clazz) {
        try {
            return BASIC.readValue(json, BASIC.getTypeFactory().constructCollectionType(List.class, clazz));
        } catch (Exception e) {
            if (LogUtil.ROOT_LOG.isErrorEnabled()) {
                LogUtil.ROOT_LOG.error(String.format("json(%s) to List<%s> exception", json, clazz), e);
            }
            return null;
        }
    }


}
