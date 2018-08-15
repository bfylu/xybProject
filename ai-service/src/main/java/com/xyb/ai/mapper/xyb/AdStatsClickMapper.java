package com.xyb.ai.mapper.xyb;

import com.xyb.ai.model.xyb.AdStatsClick;
import com.xyb.ai.model.xyb.AdStatsClickExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdStatsClickMapper {
    long countByExample(AdStatsClickExample example);

    int deleteByExample(AdStatsClickExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdStatsClick record);

    int insertSelective(AdStatsClick record);

    List<AdStatsClick> selectByExample(AdStatsClickExample example);

    AdStatsClick selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdStatsClick record, @Param("example") AdStatsClickExample example);

    int updateByExample(@Param("record") AdStatsClick record, @Param("example") AdStatsClickExample example);

    int updateByPrimaryKeySelective(AdStatsClick record);

    int updateByPrimaryKey(AdStatsClick record);
}