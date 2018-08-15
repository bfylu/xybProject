package com.xyb.shop.mapper.xyb;

import com.xyb.shop.model.xyb.MerchantContact;
import com.xyb.shop.model.xyb.MerchantContactExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MerchantContactMapper {
    long countByExample(MerchantContactExample example);

    int deleteByExample(MerchantContactExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MerchantContact record);

    int insertSelective(MerchantContact record);

    List<MerchantContact> selectByExample(MerchantContactExample example);

    MerchantContact selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MerchantContact record, @Param("example") MerchantContactExample example);

    int updateByExample(@Param("record") MerchantContact record, @Param("example") MerchantContactExample example);

    int updateByPrimaryKeySelective(MerchantContact record);

    int updateByPrimaryKey(MerchantContact record);
}