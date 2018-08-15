package com.xyb.ai.mapper.xyb;

import com.xyb.ai.model.xyb.AppMessage;
import com.xyb.ai.model.xyb.AppMessageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AppMessageMapper {
    long countByExample(AppMessageExample example);

    int deleteByExample(AppMessageExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AppMessage record);

    int insertSelective(AppMessage record);

    List<AppMessage> selectByExample(AppMessageExample example);

    AppMessage selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AppMessage record, @Param("example") AppMessageExample example);

    int updateByExample(@Param("record") AppMessage record, @Param("example") AppMessageExample example);

    int updateByPrimaryKeySelective(AppMessage record);

    int updateByPrimaryKey(AppMessage record);
}