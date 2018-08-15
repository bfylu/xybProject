package com.xyb.ai.service.impl;

import com.xyb.ai.mapper.ai.TStatisticsDetailMapper;
import com.xyb.ai.model.ai.TStatisticsDetail;
import com.xyb.ai.model.ai.TStatisticsDetailExample;
import com.xyb.ai.service.TStatisticsDetailService;
import com.xyb.common.util.U;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service(value = "TStatisticsDetailService")
@CacheConfig(cacheNames = "TStatisticsDetail")
public class TStatisticsDetailServiceImpl implements TStatisticsDetailService {

    @Autowired
    private TStatisticsDetailMapper tStatisticsDetailMapper;

    @Override
    public List<TStatisticsDetail> findByCondition(TStatisticsDetail record) {
        TStatisticsDetailExample tStatisticsDetailExample = new TStatisticsDetailExample();
        TStatisticsDetailExample.Criteria criteria = tStatisticsDetailExample.createCriteria();
        if (U.isNotBlank(record.getUnionid())) {
            criteria.andUnionidEqualTo(record.getUnionid());
        }
        if (U.isNotBlank(record.getCreateDate())) {
            criteria.andCreateDateEqualTo(record.getCreateDate());
        }
        if (U.isNotBlank(record.getType())){
            criteria.andTypeEqualTo(record.getType());
        }
        List<TStatisticsDetail> tStatisticsDetailList = tStatisticsDetailMapper.selectByExample(tStatisticsDetailExample);
        return tStatisticsDetailList;
    }

    @Override
    @CachePut(key = "#result.id", unless = "#result == null")
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public TStatisticsDetail insertSelective(TStatisticsDetail record) {
        record.setCreateDt(new Date());
        record.setCreateDate(new Date());
        int count = tStatisticsDetailMapper.insertSelective(record);
        if (0 == count) {
            return null;
        }
        return record;
    }

    @Override
    public TStatisticsDetail updateByPrimaryKey(TStatisticsDetail record) {
        record.setUpdateDt(new Date());
        int count = tStatisticsDetailMapper.updateByPrimaryKey(record);
        if (0 == count) {
            return null;
        }
        return record;
    }

}
