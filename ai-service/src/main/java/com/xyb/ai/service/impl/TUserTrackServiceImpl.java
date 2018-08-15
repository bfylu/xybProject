package com.xyb.ai.service.impl;

import com.xyb.ai.mapper.ai.TUserPositionMapper;
import com.xyb.ai.mapper.ai.TUserTrackMapper;
import com.xyb.ai.model.ai.TPca;
import com.xyb.ai.model.ai.TUserPosition;
import com.xyb.ai.model.ai.TUserPositionExample;
import com.xyb.ai.model.ai.TUserTrack;
import com.xyb.ai.model.xyb.WechatUser;
import com.xyb.ai.service.TPcaService;
import com.xyb.ai.service.TUserTrackService;
import com.xyb.ai.service.WechatUserService;
import com.xyb.common.util.U;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service(value = "TUserTrackService")
@CacheConfig(cacheNames = "TUserTrack")

public class TUserTrackServiceImpl implements TUserTrackService {

    @Autowired
    private TUserTrackMapper tUserTrackMapper;

    @Autowired
    private TUserPositionMapper tUserPositionMapper;

    @Autowired
    private WechatUserService wechatUserService;

    @Autowired
    private TPcaService tPcaService;

    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public boolean insertSelective(TUserTrack record, String city, String area) {
        boolean result = false;
        try {
            WechatUser wechatUser = wechatUserService.selectByOpenId(record.getUserId());
            if (U.isBlank(wechatUser)) {
                return false;
            }
            TPca tPca = new TPca();
            if (null != city && null != area) {
                tPca = tPcaService.getForCityAndArea(city, area);
            }
            record.setUserJmgUrl(wechatUser.getHeadimgurl());
            record.setNick(wechatUser.getNickname());
            record.setSex(Integer.valueOf(null == wechatUser.getSex() ? "0" : wechatUser.getSex()).shortValue());
            record.setPhone(null == wechatUser.getPhone() ? "" : wechatUser.getPhone());
            record.setPcaCode(null == tPca.getPcaCode() ? null : tPca.getPcaCode());
            record.setStatus((short) 1);
            record.setCreateDt(new Date());
            tUserTrackMapper.insertSelective(record);

            /**
             *  按条件查询
             */
            TUserPositionExample tUserPositionExample = new TUserPositionExample();
            TUserPositionExample.Criteria criteria = tUserPositionExample.createCriteria();

            if (U.isNotBlank(record.getUserId())) {
                criteria.andUserIdEqualTo(record.getUserId());
            }

            List<TUserPosition> list = tUserPositionMapper.selectByExample(tUserPositionExample);


            TUserPosition tUserPosition = new TUserPosition();


            /**
             * 添加用户轨迹,如果用户(user_id)已经存在就更新用户轨迹
             */
            if (list.size() < 1) {
                tUserPosition.setUserId(record.getUserId());
                tUserPosition.setCurAddress(record.getCurAddress());
                tUserPosition.setLatitude(record.getLatitude());
                tUserPosition.setLongitude(record.getLongitude());
                tUserPosition.setUserJmgUrl(wechatUser.getHeadimgurl());
                tUserPosition.setNick(wechatUser.getNickname());
                tUserPosition.setSex(Integer.valueOf(null == wechatUser.getSex() ? "0" : wechatUser.getSex()).shortValue());
                tUserPosition.setPhone(null == wechatUser.getPhone() ? "" : wechatUser.getPhone());
                tUserPosition.setPcaCode(null == tPca.getPcaCode() ? null : tPca.getPcaCode());
                tUserPosition.setStatus((short) 1);
                tUserPosition.setCreateDt(new Date());
                tUserPosition.setUpdateDt(new Date());
                tUserPositionMapper.insertSelective(tUserPosition);
            } else {
                tUserPosition.setId(list.get(0).getId());
                tUserPosition.setUserId(record.getUserId());
                tUserPosition.setCurAddress(record.getCurAddress());
                tUserPosition.setLatitude(record.getLatitude());
                tUserPosition.setLongitude(record.getLongitude());
                tUserPosition.setUserJmgUrl(wechatUser.getHeadimgurl());
                tUserPosition.setNick(wechatUser.getNickname());
                tUserPosition.setSex(Integer.valueOf(null == wechatUser.getSex() ? "0" : wechatUser.getSex()).shortValue());
                tUserPosition.setPhone(null == wechatUser.getPhone() ? "" : wechatUser.getPhone());
                tUserPosition.setPcaCode(null == tPca.getPcaCode() ? null : tPca.getPcaCode());
                tUserPosition.setStatus((short) 1);
                tUserPosition.setUpdateDt(new Date());
                tUserPositionMapper.updateByPrimaryKey(tUserPosition);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
        result = true;
        return result;
    }

    @Override
    @CachePut(key = "#result.id", unless = "#result == null")
    public TUserTrack updateSelective(TUserTrack record) {
        int count = tUserTrackMapper.updateByPrimaryKey(record);
        if (0 == count) {
            return null;
        }
        return record;
    }

    @Override
    @CacheEvict(key = "#id")
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public int deleteByPrimaryKey(Long id) {
        if (null == id) {
            return 0;
        }
        return tUserTrackMapper.deleteByPrimaryKey(id);
    }
}
