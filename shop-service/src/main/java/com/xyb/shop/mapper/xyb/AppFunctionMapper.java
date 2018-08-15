package com.xyb.shop.mapper.xyb;

import com.xyb.shop.model.xyb.AppFunction;
import com.xyb.shop.model.xyb.AppFunctionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AppFunctionMapper {
    long countByExample(AppFunctionExample example);

    int deleteByExample(AppFunctionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AppFunction record);

    int insertSelective(AppFunction record);

    List<AppFunction> selectByExample(AppFunctionExample example);

    AppFunction selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AppFunction record, @Param("example") AppFunctionExample example);

    int updateByExample(@Param("record") AppFunction record, @Param("example") AppFunctionExample example);

    int updateByPrimaryKeySelective(AppFunction record);

    int updateByPrimaryKey(AppFunction record);
}