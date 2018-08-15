package com.xyb.ai.service.impl;

import com.xyb.ai.common.TlsSig;
import com.xyb.ai.mapper.ai.TImUserMapper;
import com.xyb.ai.model.ai.TImUser;
import com.xyb.ai.model.ai.TImUserExample;
import com.xyb.ai.service.TImUserService;
import com.xyb.ai.vo.TlsIdAndSigVo;
import com.xyb.common.util.A;
import com.xyb.common.util.U;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.net.URLEncoder;
import java.util.List;

@Service(value = "TImUserService")
@CacheConfig(cacheNames = "TImUser")
public class TImUserServiceImpl implements TImUserService {

    @Autowired
    private TImUserMapper tImUserMapper;//这里会报错，但是并不会影响

    @Autowired
    private TlsSig tlsSig;

    @Override
    public List<TImUser> findByUserId(List<String> userId) {
        if (A.isEmpty(userId)) {
            return null;
        }

        TImUserExample tImUserExample = new TImUserExample();
        TImUserExample.Criteria criteria = tImUserExample.createCriteria();
        criteria.andUserIdIn(userId);
        criteria.andStatusEqualTo((short) 1);
        return tImUserMapper.selectByExample(tImUserExample);
    }


    @Override
    @Cacheable(key = "#id", unless = "#result == null")
    public TImUser selectByPrimaryKey(Long id) {
        return tImUserMapper.selectByPrimaryKey(id);
    }

    @Override
    @CacheEvict(key = "#id")
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public int deleteByPrimaryKey(Long id) {
        return tImUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    @CachePut(key = "#result.id", unless = "#result == null")
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public TImUser insertSelective(TImUser record) {
        int count = tImUserMapper.insertSelective(record);
        if (count == 0) {
            return null;
        }

        return record;
    }

    @Override
    @CachePut(key = "#record.id", unless = "#result == null")
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public TImUser updateByPrimaryKey(TImUser record) {
        int count = tImUserMapper.updateByPrimaryKeySelective(record);
        if (count == 0) {
            return null;
        }

        return record;
    }

    public TlsIdAndSigVo accountImportAndReturnSig(String identifier, String nick, String faceUrl) throws Exception {
        TlsIdAndSigVo tlsIdAndSigVo = tlsSig.accountImportAndReturnSig(identifier, nick, faceUrl);
        U.assertException(U.isBlank(tlsIdAndSigVo), "TLS签名为空值!");

        TImUserExample tImUserExample = new TImUserExample();
        TImUserExample.Criteria criteria = tImUserExample.createCriteria();
        criteria.andUserIdEqualTo(identifier);
        criteria.andStatusEqualTo((short) 1);
        List<TImUser> listImUser = tImUserMapper.selectByExample(tImUserExample);

        //解决昵称中带有图像问题
        String nickName = URLEncoder.encode(nick, "utf-8");
        TImUser tImUser = new TImUser();
        tImUser.setUserId(identifier);
        tImUser.setNick(nickName);
        tImUser.setUserJmgUrl(faceUrl);

        if (A.isEmpty(listImUser)) {
            int count = tImUserMapper.insertSelective(tImUser);
            U.assertException(count == 0, "保存IM用户失败!");
        } else {
            int count = tImUserMapper.updateByExample(tImUser, tImUserExample);
            U.assertException(count == 0, "更新IM用户失败!");
        }

        return tlsIdAndSigVo;
    }
}
