package com.xyb.ai.mapper.xyb;

import com.xyb.ai.model.xyb.TotalTransOrder;
import com.xyb.ai.model.xyb.TotalTransOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TotalTransOrderMapper {
    long countByExample(TotalTransOrderExample example);

    int deleteByExample(TotalTransOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TotalTransOrder record);

    int insertSelective(TotalTransOrder record);

    List<TotalTransOrder> selectByExample(TotalTransOrderExample example);

    TotalTransOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TotalTransOrder record, @Param("example") TotalTransOrderExample example);

    int updateByExample(@Param("record") TotalTransOrder record, @Param("example") TotalTransOrderExample example);

    int updateByPrimaryKeySelective(TotalTransOrder record);

    int updateByPrimaryKey(TotalTransOrder record);
}