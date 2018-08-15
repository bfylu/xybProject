package com.xyb.shop.mapper.xyb;

import com.xyb.shop.model.xyb.GoodsType;
import com.xyb.shop.model.xyb.GoodsTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsTypeMapper {
    long countByExample(GoodsTypeExample example);

    int deleteByExample(GoodsTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GoodsType record);

    int insertSelective(GoodsType record);

    List<GoodsType> selectByExample(GoodsTypeExample example);

    GoodsType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GoodsType record, @Param("example") GoodsTypeExample example);

    int updateByExample(@Param("record") GoodsType record, @Param("example") GoodsTypeExample example);

    int updateByPrimaryKeySelective(GoodsType record);

    int updateByPrimaryKey(GoodsType record);
}