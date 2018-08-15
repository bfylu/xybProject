package com.xyb.ai.mapper.xyb;

import com.xyb.ai.model.xyb.OrderOperationLog;
import com.xyb.ai.model.xyb.OrderOperationLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderOperationLogMapper {
    long countByExample(OrderOperationLogExample example);

    int deleteByExample(OrderOperationLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrderOperationLog record);

    int insertSelective(OrderOperationLog record);

    List<OrderOperationLog> selectByExample(OrderOperationLogExample example);

    OrderOperationLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrderOperationLog record, @Param("example") OrderOperationLogExample example);

    int updateByExample(@Param("record") OrderOperationLog record, @Param("example") OrderOperationLogExample example);

    int updateByPrimaryKeySelective(OrderOperationLog record);

    int updateByPrimaryKey(OrderOperationLog record);
}