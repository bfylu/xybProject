package com.xyb.ai.mapper.xyb;

import com.xyb.ai.model.xyb.ConfScoreSetting;
import com.xyb.ai.model.xyb.ConfScoreSettingExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ConfScoreSettingMapper {
    long countByExample(ConfScoreSettingExample example);

    int deleteByExample(ConfScoreSettingExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ConfScoreSetting record);

    int insertSelective(ConfScoreSetting record);

    List<ConfScoreSetting> selectByExample(ConfScoreSettingExample example);

    ConfScoreSetting selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ConfScoreSetting record, @Param("example") ConfScoreSettingExample example);

    int updateByExample(@Param("record") ConfScoreSetting record, @Param("example") ConfScoreSettingExample example);

    int updateByPrimaryKeySelective(ConfScoreSetting record);

    int updateByPrimaryKey(ConfScoreSetting record);
}