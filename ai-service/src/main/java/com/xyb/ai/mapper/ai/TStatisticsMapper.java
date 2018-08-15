package com.xyb.ai.mapper.ai;

import com.xyb.ai.model.ai.TStatistics;
import com.xyb.ai.model.ai.TStatisticsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TStatisticsMapper {
    long countByExample(TStatisticsExample example);

    int deleteByExample(TStatisticsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TStatistics record);

    int insertSelective(TStatistics record);

    List<TStatistics> selectByExample(TStatisticsExample example);

    TStatistics selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TStatistics record, @Param("example") TStatisticsExample example);

    int updateByExample(@Param("record") TStatistics record, @Param("example") TStatisticsExample example);

    int updateByPrimaryKeySelective(TStatistics record);

    int updateByPrimaryKey(TStatistics record);
}