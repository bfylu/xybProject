package com.xyb.ai.mapper.xyb;

import com.xyb.ai.model.xyb.MemberBill;
import com.xyb.ai.model.xyb.MemberBillExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MemberBillMapper {
    long countByExample(MemberBillExample example);

    int deleteByExample(MemberBillExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MemberBill record);

    int insertSelective(MemberBill record);

    List<MemberBill> selectByExample(MemberBillExample example);

    MemberBill selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MemberBill record, @Param("example") MemberBillExample example);

    int updateByExample(@Param("record") MemberBill record, @Param("example") MemberBillExample example);

    int updateByPrimaryKeySelective(MemberBill record);

    int updateByPrimaryKey(MemberBill record);
}