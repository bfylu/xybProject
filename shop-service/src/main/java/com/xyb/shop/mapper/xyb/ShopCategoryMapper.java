package com.xyb.shop.mapper.xyb;

import com.xyb.shop.model.xyb.ShopCategory;
import com.xyb.shop.model.xyb.ShopCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopCategoryMapper {
    long countByExample(ShopCategoryExample example);

    int deleteByExample(ShopCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ShopCategory record);

    int insertSelective(ShopCategory record);

    List<ShopCategory> selectByExample(ShopCategoryExample example);

    ShopCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ShopCategory record, @Param("example") ShopCategoryExample example);

    int updateByExample(@Param("record") ShopCategory record, @Param("example") ShopCategoryExample example);

    int updateByPrimaryKeySelective(ShopCategory record);

    int updateByPrimaryKey(ShopCategory record);
}