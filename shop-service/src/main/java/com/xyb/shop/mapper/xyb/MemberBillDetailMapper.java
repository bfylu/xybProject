package com.xyb.shop.mapper.xyb;

import com.xyb.shop.model.xyb.MemberBillDetail;
import com.xyb.shop.model.xyb.MemberBillDetailExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MemberBillDetailMapper {
    long countByExample(MemberBillDetailExample example);

    int deleteByExample(MemberBillDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MemberBillDetail record);

    int insertSelective(MemberBillDetail record);

    List<MemberBillDetail> selectByExample(MemberBillDetailExample example);

    MemberBillDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MemberBillDetail record, @Param("example") MemberBillDetailExample example);

    int updateByExample(@Param("record") MemberBillDetail record, @Param("example") MemberBillDetailExample example);

    int updateByPrimaryKeySelective(MemberBillDetail record);

    int updateByPrimaryKey(MemberBillDetail record);
}