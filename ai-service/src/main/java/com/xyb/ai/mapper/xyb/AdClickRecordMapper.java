package com.xyb.ai.mapper.xyb;

import com.xyb.ai.model.xyb.AdClickRecord;
import com.xyb.ai.model.xyb.AdClickRecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdClickRecordMapper {
    long countByExample(AdClickRecordExample example);

    int deleteByExample(AdClickRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdClickRecord record);

    int insertSelective(AdClickRecord record);

    List<AdClickRecord> selectByExample(AdClickRecordExample example);

    AdClickRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdClickRecord record, @Param("example") AdClickRecordExample example);

    int updateByExample(@Param("record") AdClickRecord record, @Param("example") AdClickRecordExample example);

    int updateByPrimaryKeySelective(AdClickRecord record);

    int updateByPrimaryKey(AdClickRecord record);
}