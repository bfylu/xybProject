package com.xyb.shop.mapper.xyb;

import com.xyb.shop.model.xyb.MemberRefund;
import com.xyb.shop.model.xyb.MemberRefundExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MemberRefundMapper {
    long countByExample(MemberRefundExample example);

    int deleteByExample(MemberRefundExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MemberRefund record);

    int insertSelective(MemberRefund record);

    List<MemberRefund> selectByExample(MemberRefundExample example);

    MemberRefund selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MemberRefund record, @Param("example") MemberRefundExample example);

    int updateByExample(@Param("record") MemberRefund record, @Param("example") MemberRefundExample example);

    int updateByPrimaryKeySelective(MemberRefund record);

    int updateByPrimaryKey(MemberRefund record);
}