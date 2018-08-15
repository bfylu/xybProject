package com.xyb.ai.mapper.xyb;

import com.xyb.ai.model.xyb.GoodsAdvertising;
import com.xyb.ai.model.xyb.GoodsAdvertisingExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsAdvertisingMapper {
    long countByExample(GoodsAdvertisingExample example);

    int deleteByExample(GoodsAdvertisingExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GoodsAdvertising record);

    int insertSelective(GoodsAdvertising record);

    List<GoodsAdvertising> selectByExample(GoodsAdvertisingExample example);

    GoodsAdvertising selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GoodsAdvertising record, @Param("example") GoodsAdvertisingExample example);

    int updateByExample(@Param("record") GoodsAdvertising record, @Param("example") GoodsAdvertisingExample example);

    int updateByPrimaryKeySelective(GoodsAdvertising record);

    int updateByPrimaryKey(GoodsAdvertising record);
}