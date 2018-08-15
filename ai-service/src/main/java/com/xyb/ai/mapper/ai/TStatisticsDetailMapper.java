package com.xyb.ai.mapper.ai;

import com.xyb.ai.model.ai.TStatisticsDetail;
import com.xyb.ai.model.ai.TStatisticsDetailExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TStatisticsDetailMapper {
    long countByExample(TStatisticsDetailExample example);

    int deleteByExample(TStatisticsDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TStatisticsDetail record);

    int insertSelective(TStatisticsDetail record);

    List<TStatisticsDetail> selectByExample(TStatisticsDetailExample example);

    TStatisticsDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TStatisticsDetail record, @Param("example") TStatisticsDetailExample example);

    int updateByExample(@Param("record") TStatisticsDetail record, @Param("example") TStatisticsDetailExample example);

    int updateByPrimaryKeySelective(TStatisticsDetail record);

    int updateByPrimaryKey(TStatisticsDetail record);
}