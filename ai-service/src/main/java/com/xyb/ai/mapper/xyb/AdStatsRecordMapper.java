package com.xyb.ai.mapper.xyb;

import com.xyb.ai.model.xyb.AdStatsRecord;
import com.xyb.ai.model.xyb.AdStatsRecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdStatsRecordMapper {
    long countByExample(AdStatsRecordExample example);

    int deleteByExample(AdStatsRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdStatsRecord record);

    int insertSelective(AdStatsRecord record);

    List<AdStatsRecord> selectByExample(AdStatsRecordExample example);

    AdStatsRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdStatsRecord record, @Param("example") AdStatsRecordExample example);

    int updateByExample(@Param("record") AdStatsRecord record, @Param("example") AdStatsRecordExample example);

    int updateByPrimaryKeySelective(AdStatsRecord record);

    int updateByPrimaryKey(AdStatsRecord record);
}