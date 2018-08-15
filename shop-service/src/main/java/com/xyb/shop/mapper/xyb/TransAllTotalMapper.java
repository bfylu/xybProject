package com.xyb.shop.mapper.xyb;

import com.xyb.shop.model.xyb.TransAllTotal;
import com.xyb.shop.model.xyb.TransAllTotalExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TransAllTotalMapper {
    long countByExample(TransAllTotalExample example);

    int deleteByExample(TransAllTotalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TransAllTotal record);

    int insertSelective(TransAllTotal record);

    List<TransAllTotal> selectByExample(TransAllTotalExample example);

    TransAllTotal selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TransAllTotal record, @Param("example") TransAllTotalExample example);

    int updateByExample(@Param("record") TransAllTotal record, @Param("example") TransAllTotalExample example);

    int updateByPrimaryKeySelective(TransAllTotal record);

    int updateByPrimaryKey(TransAllTotal record);
}