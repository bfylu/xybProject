package com.xyb.ai.service.impl;

//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.JSONObject;
//import com.xyb.ai.common.util.A;
//import com.xyb.ai.common.util.U;
//import com.xyb.ai.mapper.ums.WeixinUserMapper;
//import com.xyb.ai.model.ums.WeixinUser;
//import com.xyb.ai.model.ums.WeixinUserExample;
import com.xyb.ai.service.WeiXinUserService;
//import com.xyb.ai.weixin.WeChatAppLogin;
//import org.springframework.beans.factory.annotation.Autowired;

public class WeiXinUserServiceImpl implements WeiXinUserService {
//    @Autowired
//    private WeixinUserMapper weixinUserMapper;//这里会报错，但是并不会影响
//
//    // 根据小程序传入的 code 获取 openid和session_key等信息
//    @Override
//    public JSONObject weiXinCode(String code) {
//        String result = "";
//
//        try {
//            result = WeChatAppLogin.getSessionKeyOrOpenid(code);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        if (U.isBlank(result)) {
//            return null;
//        }
//
//        JSONObject jsonObject = JSON.parseObject(result);
//
//        return jsonObject;
//    }
//
//    @Override
//    public WeixinUser selectByPrimaryKey(Integer weixinUserId) {
//        return weixinUserMapper.selectByPrimaryKey(weixinUserId);
//    }
//
//    @Override
//    public WeixinUser selectByOpenid(String openid) {
//        WeixinUserExample weixinUserExample = new WeixinUserExample();
//        WeixinUserExample.Criteria criteria = weixinUserExample.createCriteria();
//        criteria.andOpenidEqualTo(openid);
//
//        return A.first(weixinUserMapper.selectByExample(weixinUserExample));
//    }
//
//    @Override
//    public int deleteByPrimaryKey(Integer weixinUserId) {
//        return weixinUserMapper.deleteByPrimaryKey(weixinUserId);
//    }
//
//    @Override
//    public WeixinUser insertSelective(WeixinUser record) {
//        int count = weixinUserMapper.insertSelective(record);
//        if (count == 0) {
//            return null;
//        }
//
//        return record;
//    }
//
//    @Override
//    public WeixinUser updateByPrimaryKey(WeixinUser record) {
//        int count = weixinUserMapper.updateByPrimaryKeySelective(record);
//        if (count == 0) {
//            return null;
//        }
//        return record;
//    }
}
