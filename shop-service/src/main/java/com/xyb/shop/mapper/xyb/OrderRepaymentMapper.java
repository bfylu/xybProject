package com.xyb.shop.mapper.xyb;

import com.xyb.shop.model.xyb.OrderRepayment;
import com.xyb.shop.model.xyb.OrderRepaymentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderRepaymentMapper {
    long countByExample(OrderRepaymentExample example);

    int deleteByExample(OrderRepaymentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrderRepayment record);

    int insertSelective(OrderRepayment record);

    List<OrderRepayment> selectByExample(OrderRepaymentExample example);

    OrderRepayment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrderRepayment record, @Param("example") OrderRepaymentExample example);

    int updateByExample(@Param("record") OrderRepayment record, @Param("example") OrderRepaymentExample example);

    int updateByPrimaryKeySelective(OrderRepayment record);

    int updateByPrimaryKey(OrderRepayment record);
}