package com.xyb.ai.mapper.xyb;

import com.xyb.ai.model.xyb.AdClickTotal;
import com.xyb.ai.model.xyb.AdClickTotalExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdClickTotalMapper {
    long countByExample(AdClickTotalExample example);

    int deleteByExample(AdClickTotalExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdClickTotal record);

    int insertSelective(AdClickTotal record);

    List<AdClickTotal> selectByExample(AdClickTotalExample example);

    AdClickTotal selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdClickTotal record, @Param("example") AdClickTotalExample example);

    int updateByExample(@Param("record") AdClickTotal record, @Param("example") AdClickTotalExample example);

    int updateByPrimaryKeySelective(AdClickTotal record);

    int updateByPrimaryKey(AdClickTotal record);
}