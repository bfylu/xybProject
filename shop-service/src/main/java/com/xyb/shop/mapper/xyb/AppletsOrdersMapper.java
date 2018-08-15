package com.xyb.shop.mapper.xyb;

import com.xyb.shop.model.xyb.AppletsOrders;
import com.xyb.shop.model.xyb.AppletsOrdersExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AppletsOrdersMapper {
    long countByExample(AppletsOrdersExample example);

    int deleteByExample(AppletsOrdersExample example);

    int deleteByPrimaryKey(Long orderId);

    int insert(AppletsOrders record);

    int insertSelective(AppletsOrders record);

    List<AppletsOrders> selectByExample(AppletsOrdersExample example);

    AppletsOrders selectByPrimaryKey(Long orderId);

    int updateByExampleSelective(@Param("record") AppletsOrders record, @Param("example") AppletsOrdersExample example);

    int updateByExample(@Param("record") AppletsOrders record, @Param("example") AppletsOrdersExample example);

    int updateByPrimaryKeySelective(AppletsOrders record);

    int updateByPrimaryKey(AppletsOrders record);
}