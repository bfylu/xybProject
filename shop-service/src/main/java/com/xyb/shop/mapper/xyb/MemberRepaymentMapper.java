package com.xyb.shop.mapper.xyb;

import com.xyb.shop.model.xyb.MemberRepayment;
import com.xyb.shop.model.xyb.MemberRepaymentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MemberRepaymentMapper {
    long countByExample(MemberRepaymentExample example);

    int deleteByExample(MemberRepaymentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MemberRepayment record);

    int insertSelective(MemberRepayment record);

    List<MemberRepayment> selectByExample(MemberRepaymentExample example);

    MemberRepayment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MemberRepayment record, @Param("example") MemberRepaymentExample example);

    int updateByExample(@Param("record") MemberRepayment record, @Param("example") MemberRepaymentExample example);

    int updateByPrimaryKeySelective(MemberRepayment record);

    int updateByPrimaryKey(MemberRepayment record);
}