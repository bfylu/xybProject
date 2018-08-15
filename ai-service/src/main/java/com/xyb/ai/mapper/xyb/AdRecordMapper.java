package com.xyb.ai.mapper.xyb;

import com.xyb.ai.model.xyb.AdRecord;
import com.xyb.ai.model.xyb.AdRecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdRecordMapper {
    long countByExample(AdRecordExample example);

    int deleteByExample(AdRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdRecord record);

    int insertSelective(AdRecord record);

    List<AdRecord> selectByExample(AdRecordExample example);

    AdRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdRecord record, @Param("example") AdRecordExample example);

    int updateByExample(@Param("record") AdRecord record, @Param("example") AdRecordExample example);

    int updateByPrimaryKeySelective(AdRecord record);

    int updateByPrimaryKey(AdRecord record);
}