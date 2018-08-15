package com.xyb.ai.service.impl;

import com.github.pagehelper.PageHelper;
import com.xyb.ai.mapper.ai.TPcaMapper;
import com.xyb.ai.model.ai.TPca;
import com.xyb.ai.model.ai.TPcaExample;
import com.xyb.ai.service.TPcaService;
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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service(value = "TPcaService")
@CacheConfig(cacheNames = "TPca")
public class TPcaServiceImpl implements TPcaService {

    @Autowired
    private TPcaMapper tPcaMapper;//这里会报错，但是并不会影响

    @Override
    @Cacheable(key = "#pcaCode", unless = "#result == null")
    public TPca selectByPrimaryKey(String pcaCode) {
        return tPcaMapper.selectByPrimaryKey(pcaCode);
    }

    @Override
    @CacheEvict(key = "#pcaCode")
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public int deleteByPrimaryKey(String pcaCode) {
        return tPcaMapper.deleteByPrimaryKey(pcaCode);
    }

    @Override
    @CachePut(key = "#result.pcaCode", unless = "#result == null")
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public TPca insertSelective(TPca record) {
        int count = tPcaMapper.insertSelective(record);
        if (count == 0) {
            return null;
        }

        return record;
    }

    @Override
    @CachePut(key = "#record.pcaCode", unless = "#result == null")
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public TPca updateByPrimaryKey(TPca record) {
        int count = tPcaMapper.updateByPrimaryKeySelective(record);
        if (count == 0) {
            return null;
        }

        return record;
    }

    //多条件查询，找出符合条件的记录
    @Override
    public PageInfo<TPca> findByCondition(TPca record, int pageNum, int pageSize) {
        TPcaExample tPcaExample = new TPcaExample();
        TPcaExample.Criteria criteria = tPcaExample.createCriteria();

        tPcaExample.setOrderByClause(" pca_code");
        if (U.isNotBlank(record.getPcaCode())) {
            criteria.andPcaCodeEqualTo(record.getPcaCode());
        }

        if (U.isNotBlank(record.getPcaName())) {
            criteria.andPcaNameEqualTo(record.getPcaName());
        }
        criteria.andStatusEqualTo(true);

        PageHelper.startPage(pageNum, pageSize);
        List<TPca> listTPca = tPcaMapper.selectByExample(tPcaExample);
        PageInfo<TPca> pageInfoTPca = new PageInfo<>(listTPca);

        return pageInfoTPca;
    }

    @Override
    public TPca getForCityAndArea(String city, String area) {
        Map<String,String> condition = new HashMap<>();
        condition.put("city",city);
        condition.put("area",area);
        TPca tPca = tPcaMapper.getForCityAndArea(condition);
        return tPca;
    }
}
