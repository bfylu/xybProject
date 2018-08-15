package com.xyb.shop.mapper.xyb;

import com.xyb.shop.model.xyb.MallSellOrder;
import com.xyb.shop.model.xyb.MallSellOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MallSellOrderMapper {
    long countByExample(MallSellOrderExample example);

    int deleteByExample(MallSellOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallSellOrder record);

    int insertSelective(MallSellOrder record);

    List<MallSellOrder> selectByExample(MallSellOrderExample example);

    MallSellOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallSellOrder record, @Param("example") MallSellOrderExample example);

    int updateByExample(@Param("record") MallSellOrder record, @Param("example") MallSellOrderExample example);

    int updateByPrimaryKeySelective(MallSellOrder record);

    int updateByPrimaryKey(MallSellOrder record);
}