package com.xyb.ai.service.impl;

import com.xyb.ai.mapper.xyb.WechatUserMapper;
import com.xyb.ai.model.xyb.WechatUser;
import com.xyb.ai.model.xyb.WechatUserExample;
import com.xyb.ai.service.WechatUserService;
import com.xyb.common.util.U;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(value = "WechatUserService")
@CacheConfig(cacheNames = "WechatUser")
public class WechatUserServiceImpl implements WechatUserService {

    @Autowired
    private WechatUserMapper wechatUserMapper;

    @Override
    @CachePut(key = "#result.id", unless = "#result == null")
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public WechatUser selectByOpenId(String openId) {
        WechatUserExample wechatUserExample = new WechatUserExample();
        WechatUserExample.Criteria criteria = wechatUserExample.createCriteria();
        if (U.isNotBlank(openId)){
            criteria.andOpenidEqualTo(openId);
        }
        List<WechatUser> wechatUserList = wechatUserMapper.selectByExample(wechatUserExample);
        if (1 > wechatUserList.size()){
            return null;
        }
        return wechatUserList.get(0);
    }
}
