package com.xyb.ai.mapper.xyb;

import com.xyb.ai.model.xyb.AppResource;
import com.xyb.ai.model.xyb.AppResourceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AppResourceMapper {
    long countByExample(AppResourceExample example);

    int deleteByExample(AppResourceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AppResource record);

    int insertSelective(AppResource record);

    List<AppResource> selectByExample(AppResourceExample example);

    AppResource selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AppResource record, @Param("example") AppResourceExample example);

    int updateByExample(@Param("record") AppResource record, @Param("example") AppResourceExample example);

    int updateByPrimaryKeySelective(AppResource record);

    int updateByPrimaryKey(AppResource record);
}