package com.xyb.ai.service;

import com.xyb.ai.model.xyb.MemberBill;

import java.util.List;

public interface MemberBillService {

    MemberBill selectByPrimaryKey(Long memberBillId);

    int deleteByPrimaryKey(Long memberBillId);

    MemberBill insertSelective(MemberBill record);

    MemberBill updateByPrimaryKey(MemberBill record);

    List<MemberBill> selectByMemberNo(String memberNo);
}
