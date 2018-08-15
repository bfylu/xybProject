package com.xyb.ai.service;

import com.xyb.ai.model.ai.TStatistics;
import com.xyb.common.PageInfo;

public interface TStatisticsService {

    boolean insertSelective(String unionid,short statisticsType);

    PageInfo<TStatistics> findByPage(int pageNum, int pageSize);
}
