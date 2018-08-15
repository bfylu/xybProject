package com.xyb.ai.controller;

import com.xyb.common.BaseController;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.xyb.ai.model.ums.WeixinUser;

@Api(tags = "微信用户接口")
@RestController
@RequestMapping(value = "/weiXinUser")
public class WeixinUserController extends BaseController {
//    @Autowired
//    private WeiXinUserService weiXinUserService;
//
//    @Autowired
//    private MemberBillService memberBillService;
//
//    @Autowired
//    private MemberService memberService;
//
//    @Autowired
//    private RedisTemplateUtil redisTemplateUtil;
//
//    @GetMapping("/login")
//    public BaseResp login(String code) {
//        JSONObject jsonWeiXinUser = weiXinUserService.weiXinCode(code);
//        if (U.isBlank(jsonWeiXinUser)) {
//            return BaseResp.fail("调用微信失败");
//        }
//        log.info("JsonWeiXinUser:" + jsonWeiXinUser.toJSONString());
//
//        String openid = "";
//        String session_key = "";
//
//        try {
//            openid = jsonWeiXinUser.get("openid").toString();           // 拿到openid
//            session_key = jsonWeiXinUser.get("session_key").toString(); // 拿到session_key
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//
//        //获取openid失败
//        if (U.isBlank(openid)) {
//            return BaseResp.fail("获取微信openid失败");
//        }
//
//        //生产随机的sessionToken，生产规则就是（openid + ":" + 随机码）
//        String sessionToken = openid + ":" + U.uuid();
//
//        JSONObject respJson = new JSONObject();
//        respJson.put("openid", openid);
//        respJson.put("session_key", session_key);
//        respJson.put("sessionToken", sessionToken);
//
//        log.info("后台调取微信API获取的openId=" + openid + ",session_key=" + session_key + ",sessionToken=" + sessionToken);
//
//        //把生成的sessionToken 存入redis
//        redisTemplateUtil.set("sessionToken:" + openid, sessionToken, 1800);  // 半个小时过期
//
//        WeixinUser weixinUser = weiXinUserService.selectByOpenid(openid);
//        if (U.isBlank(weixinUser)) {
//            //insert openid用户
//            WeixinUser tmpWeixinUse = new WeixinUser();
//            tmpWeixinUse.setOpenid(openid);
//            weiXinUserService.insertSelective(tmpWeixinUse);
//        }
//
//        int fromRepaymentDay = 0;
//        String isOverdue = "N";
//        String existRepayment = "N";
//
//        Member member = memberService.selectByUserName(openid);
//        if (U.isNotBlank(member)) {
//            if (member.getAvailableAmount() != null) {
//                respJson.put("creditAmount", member.getAvailableAmount().setScale(2).toString());
//            }
//        }
//
//        // 确认是否有逾期账单,是否有待还款金额
//        List<MemberBill> billList = memberBillService.selectByMemberNo(member.getMemberNo());
//        if (billList != null && !billList.isEmpty()) {
//            for (MemberBill tmp : billList) {
//                if (tmp.getOverdueDay() != null && tmp.getOverdueDay() > 0) {
//                    isOverdue = "Y";
//                }
//                if (0 == tmp.getRepaymentStatus()) {
//                    existRepayment = "Y";
//                }
//            }
//        }
//
//        // 计算距离还款日天数
//        Calendar c = Calendar.getInstance();
//        int nowDay = c.get(Calendar.DAY_OF_MONTH);
//        int repaymentDate = member.getRepaymentDay();
//        if (nowDay <= repaymentDate) {
//            fromRepaymentDay = repaymentDate - nowDay;
//        } else {
//            fromRepaymentDay = repaymentDate + c.getActualMaximum(Calendar.DAY_OF_MONTH) - nowDay;
//        }
//
//        respJson.put("fromRepaymentDay", fromRepaymentDay);
//        respJson.put("isOverdue", isOverdue);
//        respJson.put("existRepayment", existRepayment);
//
//        return BaseResp.success("微信小程序登录成功", respJson);
//    }
//
//    @GetMapping("/updateUser")
//    public BaseResp updateUser(WeixinUser weixinUser) {
//        if(U.isBlank(weixinUser)) {
//            return BaseResp.fail("微信用户信息为空");
//        }
//
//        if(U.isBlank(weixinUser.getOpenid())) {
//            return BaseResp.fail("微信openid为空");
//        }
//
////        weixinUser.setNickname(userInfo.getString("nickName"));
////        weixinUser.setHeadimgurl(userInfo.getString("avatarUrl"));
////        weixinUser.setSex(userInfo.getInteger("gender"));
////        weixinUser.setCity(userInfo.getString("city"));
////        weixinUser.setProvince(userInfo.getString("province"));
////        weixinUser.setCountry(userInfo.getString("country"));
////        weixinUser.setLanguage(userInfo.getString("language"));
////        weixinUser.setOpenid(openId);
////        weixinUser.setSex(userInfo.getInteger("gender"));
////        weixinUser.setIsAuth("N");
//
//        WeixinUser resultUser = weiXinUserService.updateByPrimaryKey(weixinUser);
//
//        return BaseResp.success("更新微信用户信息成功");
//    }

//    @PostMapping("/loginVerify")
//    public String loginVerify(String username, String password, HttpSession session) {
//        User user = new User();
//        user.setUsername(username);
//        user.setPassword(password);
//
//        boolean verify = loginService.verifyLogin(user);
//        if (verify) {
//            session.setAttribute(WebSecurityConfig.SESSION_KEY, username);
//            return "index";
//        } else {
//            return "redirect:/login";
//        }
//    }
//
//    @GetMapping("/logout")
//    public String logout(HttpSession session) {
//        session.removeAttribute(WebSecurityConfig.SESSION_KEY);
//        return "redirect:/login";
//    }
}