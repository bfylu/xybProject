package com.xyb.ai.service;

import com.xyb.ai.model.xyb.WechatUser;

public interface WechatUserService {

    /**
     * 根据openId查询用户信息
     * @param openId
     * @return
     */
    WechatUser selectByOpenId(String openId);
}
