package com.xyb.shop.mapper.xyb;

import com.xyb.shop.model.xyb.ShopCategoryGroup;
import com.xyb.shop.model.xyb.ShopCategoryGroupExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopCategoryGroupMapper {
    long countByExample(ShopCategoryGroupExample example);

    int deleteByExample(ShopCategoryGroupExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ShopCategoryGroup record);

    int insertSelective(ShopCategoryGroup record);

    List<ShopCategoryGroup> selectByExample(ShopCategoryGroupExample example);

    ShopCategoryGroup selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ShopCategoryGroup record, @Param("example") ShopCategoryGroupExample example);

    int updateByExample(@Param("record") ShopCategoryGroup record, @Param("example") ShopCategoryGroupExample example);

    int updateByPrimaryKeySelective(ShopCategoryGroup record);

    int updateByPrimaryKey(ShopCategoryGroup record);
}