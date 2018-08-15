package com.xyb.ai.mapper.xyb;

import com.xyb.ai.model.xyb.Promotion;
import com.xyb.ai.model.xyb.PromotionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PromotionMapper {
    long countByExample(PromotionExample example);

    int deleteByExample(PromotionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Promotion record);

    int insertSelective(Promotion record);

    List<Promotion> selectByExample(PromotionExample example);

    Promotion selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Promotion record, @Param("example") PromotionExample example);

    int updateByExample(@Param("record") Promotion record, @Param("example") PromotionExample example);

    int updateByPrimaryKeySelective(Promotion record);

    int updateByPrimaryKey(Promotion record);
}