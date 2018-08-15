package com.xyb.ai.mapper.xyb;

import com.xyb.ai.model.xyb.ShopCategoryBind;
import com.xyb.ai.model.xyb.ShopCategoryBindExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopCategoryBindMapper {
    long countByExample(ShopCategoryBindExample example);

    int deleteByExample(ShopCategoryBindExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ShopCategoryBind record);

    int insertSelective(ShopCategoryBind record);

    List<ShopCategoryBind> selectByExample(ShopCategoryBindExample example);

    ShopCategoryBind selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ShopCategoryBind record, @Param("example") ShopCategoryBindExample example);

    int updateByExample(@Param("record") ShopCategoryBind record, @Param("example") ShopCategoryBindExample example);

    int updateByPrimaryKeySelective(ShopCategoryBind record);

    int updateByPrimaryKey(ShopCategoryBind record);
}