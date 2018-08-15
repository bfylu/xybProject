package com.xyb.shop.mapper.xyb;

import com.xyb.shop.model.xyb.ShopGoods;
import com.xyb.shop.model.xyb.ShopGoodsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopGoodsMapper {
    long countByExample(ShopGoodsExample example);

    int deleteByExample(ShopGoodsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ShopGoods record);

    int insertSelective(ShopGoods record);

    List<ShopGoods> selectByExample(ShopGoodsExample example);

    ShopGoods selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ShopGoods record, @Param("example") ShopGoodsExample example);

    int updateByExample(@Param("record") ShopGoods record, @Param("example") ShopGoodsExample example);

    int updateByPrimaryKeySelective(ShopGoods record);

    int updateByPrimaryKey(ShopGoods record);
}