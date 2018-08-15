package com.xyb.ai.service;

import com.xyb.ai.model.ai.TStatisticsDetail;

import java.util.List;

public interface TStatisticsDetailService {

     /**
      * 按条件查询用户PV
      * @param record
      * @return
      */
     List<TStatisticsDetail> findByCondition(TStatisticsDetail record);

     /**
      * 添加用户pv记录
      * @param record
      * @return
      */
     TStatisticsDetail insertSelective(TStatisticsDetail record);

     /**
      *修改用户pv记录
      * @param record
      * @return
      */
     TStatisticsDetail updateByPrimaryKey(TStatisticsDetail record);







}
