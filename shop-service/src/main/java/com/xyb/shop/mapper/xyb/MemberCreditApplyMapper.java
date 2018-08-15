package com.xyb.shop.mapper.xyb;

import com.xyb.shop.model.xyb.MemberCreditApply;
import com.xyb.shop.model.xyb.MemberCreditApplyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MemberCreditApplyMapper {
    long countByExample(MemberCreditApplyExample example);

    int deleteByExample(MemberCreditApplyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MemberCreditApply record);

    int insertSelective(MemberCreditApply record);

    List<MemberCreditApply> selectByExample(MemberCreditApplyExample example);

    MemberCreditApply selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MemberCreditApply record, @Param("example") MemberCreditApplyExample example);

    int updateByExample(@Param("record") MemberCreditApply record, @Param("example") MemberCreditApplyExample example);

    int updateByPrimaryKeySelective(MemberCreditApply record);

    int updateByPrimaryKey(MemberCreditApply record);
}