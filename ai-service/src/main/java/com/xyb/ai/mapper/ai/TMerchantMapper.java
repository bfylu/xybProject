package com.xyb.ai.mapper.ai;

import com.xyb.ai.model.ai.TMerchant;
import com.xyb.ai.model.ai.TMerchantExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TMerchantMapper {
    long countByExample(TMerchantExample example);

    int deleteByExample(TMerchantExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TMerchant record);

    int insertSelective(TMerchant record);

    List<TMerchant> selectByExample(TMerchantExample example);

    TMerchant selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TMerchant record, @Param("example") TMerchantExample example);

    int updateByExample(@Param("record") TMerchant record, @Param("example") TMerchantExample example);

    int updateByPrimaryKeySelective(TMerchant record);

    int updateByPrimaryKey(TMerchant record);
}