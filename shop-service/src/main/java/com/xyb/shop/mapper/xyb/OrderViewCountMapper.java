package com.xyb.shop.mapper.xyb;

import com.xyb.shop.model.xyb.OrderViewCount;
import com.xyb.shop.model.xyb.OrderViewCountExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderViewCountMapper {
    long countByExample(OrderViewCountExample example);

    int deleteByExample(OrderViewCountExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrderViewCount record);

    int insertSelective(OrderViewCount record);

    List<OrderViewCount> selectByExample(OrderViewCountExample example);

    OrderViewCount selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrderViewCount record, @Param("example") OrderViewCountExample example);

    int updateByExample(@Param("record") OrderViewCount record, @Param("example") OrderViewCountExample example);

    int updateByPrimaryKeySelective(OrderViewCount record);

    int updateByPrimaryKey(OrderViewCount record);
}