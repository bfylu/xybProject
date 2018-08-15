package com.xyb.shop.mapper.xyb;

import com.xyb.shop.model.xyb.IntegralExchangeRule;
import com.xyb.shop.model.xyb.IntegralExchangeRuleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IntegralExchangeRuleMapper {
    long countByExample(IntegralExchangeRuleExample example);

    int deleteByExample(IntegralExchangeRuleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(IntegralExchangeRule record);

    int insertSelective(IntegralExchangeRule record);

    List<IntegralExchangeRule> selectByExample(IntegralExchangeRuleExample example);

    IntegralExchangeRule selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") IntegralExchangeRule record, @Param("example") IntegralExchangeRuleExample example);

    int updateByExample(@Param("record") IntegralExchangeRule record, @Param("example") IntegralExchangeRuleExample example);

    int updateByPrimaryKeySelective(IntegralExchangeRule record);

    int updateByPrimaryKey(IntegralExchangeRule record);
}