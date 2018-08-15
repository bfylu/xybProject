package com.xyb.shop.mapper.xyb;

import com.xyb.shop.model.xyb.GoodsHot;
import com.xyb.shop.model.xyb.GoodsHotExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsHotMapper {
    long countByExample(GoodsHotExample example);

    int deleteByExample(GoodsHotExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GoodsHot record);

    int insertSelective(GoodsHot record);

    List<GoodsHot> selectByExample(GoodsHotExample example);

    GoodsHot selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GoodsHot record, @Param("example") GoodsHotExample example);

    int updateByExample(@Param("record") GoodsHot record, @Param("example") GoodsHotExample example);

    int updateByPrimaryKeySelective(GoodsHot record);

    int updateByPrimaryKey(GoodsHot record);
}