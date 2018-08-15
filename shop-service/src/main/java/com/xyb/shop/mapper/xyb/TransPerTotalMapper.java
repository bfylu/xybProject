package com.xyb.shop.mapper.xyb;

import com.xyb.shop.model.xyb.TransPerTotal;
import com.xyb.shop.model.xyb.TransPerTotalExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TransPerTotalMapper {
    long countByExample(TransPerTotalExample example);

    int deleteByExample(TransPerTotalExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TransPerTotal record);

    int insertSelective(TransPerTotal record);

    List<TransPerTotal> selectByExample(TransPerTotalExample example);

    TransPerTotal selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TransPerTotal record, @Param("example") TransPerTotalExample example);

    int updateByExample(@Param("record") TransPerTotal record, @Param("example") TransPerTotalExample example);

    int updateByPrimaryKeySelective(TransPerTotal record);

    int updateByPrimaryKey(TransPerTotal record);
}