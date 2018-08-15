package com.xyb.ai.mapper.xyb;

import com.xyb.ai.model.xyb.TransOrder;
import com.xyb.ai.model.xyb.TransOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TransOrderMapper {
    long countByExample(TransOrderExample example);

    int deleteByExample(TransOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TransOrder record);

    int insertSelective(TransOrder record);

    List<TransOrder> selectByExample(TransOrderExample example);

    TransOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TransOrder record, @Param("example") TransOrderExample example);

    int updateByExample(@Param("record") TransOrder record, @Param("example") TransOrderExample example);

    int updateByPrimaryKeySelective(TransOrder record);

    int updateByPrimaryKey(TransOrder record);
}