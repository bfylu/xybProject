package com.xyb.shop.mapper.xyb;

import com.xyb.shop.model.xyb.AppOperatorLog;
import com.xyb.shop.model.xyb.AppOperatorLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AppOperatorLogMapper {
    long countByExample(AppOperatorLogExample example);

    int deleteByExample(AppOperatorLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AppOperatorLog record);

    int insertSelective(AppOperatorLog record);

    List<AppOperatorLog> selectByExample(AppOperatorLogExample example);

    AppOperatorLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AppOperatorLog record, @Param("example") AppOperatorLogExample example);

    int updateByExample(@Param("record") AppOperatorLog record, @Param("example") AppOperatorLogExample example);

    int updateByPrimaryKeySelective(AppOperatorLog record);

    int updateByPrimaryKey(AppOperatorLog record);
}