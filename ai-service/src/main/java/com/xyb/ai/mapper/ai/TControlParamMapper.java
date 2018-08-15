package com.xyb.ai.mapper.ai;

import com.xyb.ai.model.ai.TControlParam;
import com.xyb.ai.model.ai.TControlParamExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TControlParamMapper {
    long countByExample(TControlParamExample example);

    int deleteByExample(TControlParamExample example);

    int deleteByPrimaryKey(String paramCode);

    int insert(TControlParam record);

    int insertSelective(TControlParam record);

    List<TControlParam> selectByExample(TControlParamExample example);

    TControlParam selectByPrimaryKey(String paramCode);

    int updateByExampleSelective(@Param("record") TControlParam record, @Param("example") TControlParamExample example);

    int updateByExample(@Param("record") TControlParam record, @Param("example") TControlParamExample example);

    int updateByPrimaryKeySelective(TControlParam record);

    int updateByPrimaryKey(TControlParam record);
}