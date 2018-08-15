package com.xyb.ai.mapper.xyb;

import com.xyb.ai.model.xyb.MemberCreditChange;
import com.xyb.ai.model.xyb.MemberCreditChangeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MemberCreditChangeMapper {
    long countByExample(MemberCreditChangeExample example);

    int deleteByExample(MemberCreditChangeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MemberCreditChange record);

    int insertSelective(MemberCreditChange record);

    List<MemberCreditChange> selectByExample(MemberCreditChangeExample example);

    MemberCreditChange selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MemberCreditChange record, @Param("example") MemberCreditChangeExample example);

    int updateByExample(@Param("record") MemberCreditChange record, @Param("example") MemberCreditChangeExample example);

    int updateByPrimaryKeySelective(MemberCreditChange record);

    int updateByPrimaryKey(MemberCreditChange record);
}