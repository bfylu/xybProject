package com.xyb.shop.util;

/**
 * tg获取Openid
 *
 * @author bfy--lujian
 * @version 1.0.0
 * 创建时间：2018/7/13 16:40
 * @email bfyjian@gmail.com
 */
public class OpenIdUtil {

    public static String oauth2GetOpenid(String code,String classify) {
        String appid = "";
        String appsecret = "";
        switch (classify) {
            case "1":
                //自己的配置appid
                appid = "**********";
                //自己的配置APPSECRET;
                appsecret = "**********";
                break;
            case "2":
                appid = "**********";
                appsecret = "************";
                break;
            case "3":
                appid = "**********";
                appsecret = "************";
                break;
            case "4":
                appid = "**********";
                appsecret = "************";
                break;
            case "5":
                appid = "**********";
                appsecret = "************";
        }

        //授权（必填）
        String grant_type = "authorization_code";
        //URL
        String requestUrl = "https://api.weixin.qq.com/sns/jscode2session";
        //请求参数
        String params = "appid=" + appid + "&secret=" + appsecret + "&js_code=" + code + "&grant_type=" + grant_type;
        //发送请求
        String data = HttpUtil.get(requestUrl, params);
        //解析相应内容（转换成json对象）
        //JSONObject  json = JSONObject.fromObject(data);
        //用户的唯一标识（openid）
        String Openid = null;//String.valueOf(json.get("openid"));
        //System.out.println(Openid);
        return Openid;
    }
}

