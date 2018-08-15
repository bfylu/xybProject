package com.xyb.ai.mapper.xyb;

import com.xyb.ai.model.xyb.AppletsGoodsType;
import com.xyb.ai.model.xyb.AppletsGoodsTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AppletsGoodsTypeMapper {
    long countByExample(AppletsGoodsTypeExample example);

    int deleteByExample(AppletsGoodsTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AppletsGoodsType record);

    int insertSelective(AppletsGoodsType record);

    List<AppletsGoodsType> selectByExample(AppletsGoodsTypeExample example);

    AppletsGoodsType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AppletsGoodsType record, @Param("example") AppletsGoodsTypeExample example);

    int updateByExample(@Param("record") AppletsGoodsType record, @Param("example") AppletsGoodsTypeExample example);

    int updateByPrimaryKeySelective(AppletsGoodsType record);

    int updateByPrimaryKey(AppletsGoodsType record);
}