package com.xyb.ai.service.impl;

import com.github.pagehelper.PageHelper;
import com.xyb.ai.mapper.ai.TStatisticsMapper;
import com.xyb.ai.model.ai.TStatistics;
import com.xyb.ai.model.ai.TStatisticsDetail;
import com.xyb.ai.model.ai.TStatisticsExample;
import com.xyb.ai.service.TStatisticsDetailService;
import com.xyb.ai.service.TStatisticsService;
import com.xyb.common.PageInfo;
import com.xyb.common.util.A;
import com.xyb.common.util.U;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service(value = "TStatisticsService")
@CacheConfig(cacheNames = "TStatistics")
public class TStatisticsServiceImpl implements TStatisticsService {

    @Autowired
    private TStatisticsMapper tStatisticsMapper;

    @Autowired
    private TStatisticsDetailService tStatisticsDetailService;

    @Override
    public boolean insertSelective(String unionid, short statisticsType) {
        try {
            TStatisticsDetail record = new TStatisticsDetail();
            record.setCreateDate(new Date());
            record.setUnionid(unionid);
            record.setType(statisticsType);
            List<TStatisticsDetail> tStatisticsDetailList = tStatisticsDetailService.findByCondition(record);
            TStatisticsExample tStatisticsExample = new TStatisticsExample();
            TStatisticsExample.Criteria criteria = tStatisticsExample.createCriteria();
            criteria.andCreateDateEqualTo(new Date());
            if (U.isNotBlank(statisticsType)) {
                criteria.andTypeEqualTo(statisticsType);
            }
            List<TStatistics> tStatisticsList = tStatisticsMapper.selectByExample(tStatisticsExample);
            TStatisticsDetail record1 = new TStatisticsDetail();
            record1.setUnionid(unionid);
            record1.setPv(1);
            record1.setType(statisticsType);
            TStatistics record4 = A.first(tStatisticsList);
            if (A.isEmpty(tStatisticsList)) {  //如果为空，创建一条记录，页面浏览量1，独立访客访问数1，用户访问增加一条记录
                TStatistics record3 = new TStatistics();
                record3.setPv(1);
                record3.setUv(1);
                record3.setType(statisticsType);
                record3.setStatus((short) 1);
                record3.setCreateDt(new Date());
                record3.setCreateDate(new Date());
                tStatisticsMapper.insertSelective(record3);
                tStatisticsDetailService.insertSelective(record1);
            } else {
                if (A.isEmpty(tStatisticsDetailList)) {//如果该用户今天没有访问，则，detail的PV加一条记录，总PV+1，UV+1
                    tStatisticsDetailService.insertSelective(record1);
                    record4.setPv(record4.getPv() + 1);
                    record4.setUv(record4.getUv() + 1);
                    record4.setUpdateDt(new Date());
                    tStatisticsMapper.updateByPrimaryKey(record4);
                } else {//如果该用户今天已访问，总PV+1，detail，PV+1
                    TStatisticsDetail record2 = A.first(tStatisticsDetailList);
                    record2.setPv(record2.getPv() + 1);
                    record2.setUpdateDt(new Date());
                    tStatisticsDetailService.updateByPrimaryKey(record2);
                    record4.setPv(record4.getPv() + 1);
                    record4.setUpdateDt(new Date());
                    tStatisticsMapper.updateByPrimaryKey(record4);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
        return true;
    }

    @Override
    public PageInfo<TStatistics> findByPage(int pageNum, int pageSize) {
        TStatisticsExample tStatisticsExample = new TStatisticsExample();
        TStatisticsExample.Criteria criteria = tStatisticsExample.createCriteria();
//        if (U.isNotBlank(openId)) {
//            criteria.andOpenIdEqualTo(openId);
//        }
        criteria.andStatusEqualTo((short)1);
        List<TStatistics> statisticsList = tStatisticsMapper.selectByExample(tStatisticsExample);
        PageHelper.startPage(pageNum, pageSize);
        PageInfo<TStatistics> pageInfoTstatistics = new PageInfo<>(statisticsList);
        return pageInfoTstatistics;
    }
}
