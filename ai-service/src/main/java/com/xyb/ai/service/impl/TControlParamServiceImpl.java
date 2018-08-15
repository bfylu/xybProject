package com.xyb.ai.service.impl;

import com.github.pagehelper.PageHelper;
import com.xyb.ai.mapper.ai.TControlParamMapper;
import com.xyb.ai.model.ai.TControlParam;
import com.xyb.ai.model.ai.TControlParamExample;
import com.xyb.ai.service.TControlParamService;
import com.xyb.common.PageInfo;
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

import java.util.List;

@Service(value = "TControlParamService")
@CacheConfig(cacheNames = "TControlParam")
public class TControlParamServiceImpl implements TControlParamService {

    @Autowired
    private TControlParamMapper tControlParamMapper;//这里会报错，但是并不会影响

    @Override
    @Cacheable(key = "#paramCode", unless = "#result == null")
    public TControlParam selectByPrimaryKey(String paramCode) {
        return tControlParamMapper.selectByPrimaryKey(paramCode);
    }

    @Override
    @CacheEvict(key = "#paramCode")
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public int deleteByPrimaryKey(String paramCode) {
        return tControlParamMapper.deleteByPrimaryKey(paramCode);
    }

    @Override
    @CachePut(key = "#result.paramCode", unless = "#result == null")
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public TControlParam insertSelective(TControlParam record) {
        int count = tControlParamMapper.insertSelective(record);
        if (count == 0) {
            return null;
        }

        return record;
    }

    @Override
    @CachePut(key = "#record.paramCode", unless = "#result == null")
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public TControlParam updateByPrimaryKey(TControlParam record) {
        int count = tControlParamMapper.updateByPrimaryKeySelective(record);
        if (count == 0) {
            return null;
        }

        return record;
    }

    //多条件查询，找出符合条件的记录
    @Override
    public PageInfo<TControlParam> findByCondition(TControlParam record, int pageNum, int pageSize) {
        TControlParamExample tControlParamExample = new TControlParamExample();
        TControlParamExample.Criteria criteria = tControlParamExample.createCriteria();

        tControlParamExample.setOrderByClause(" param_code");
        if (U.isNotBlank(record.getParamCode())) {
            criteria.andParamCodeEqualTo(record.getParamCode());
        }

        if (U.isNotBlank(record.getParamName())) {
            criteria.andParamNameEqualTo(record.getParamName());
        }

        if (U.isNotBlank(record.getParamType())) {
            criteria.andParamTypeEqualTo(record.getParamType());
        }

        if (U.isNotBlank(record.getValue())) {
            criteria.andValueEqualTo(record.getValue());
        }

        if (U.isNotBlank(record.getUnit())) {
            criteria.andUnitEqualTo(record.getUnit());
        }

        criteria.andStatusEqualTo(true);

        PageHelper.startPage(pageNum, pageSize);
        List<TControlParam> listTControlParam = tControlParamMapper.selectByExample(tControlParamExample);
        PageInfo<TControlParam> pageInfoTControlParam = new PageInfo<>(listTControlParam);

        return pageInfoTControlParam;
    }
}
