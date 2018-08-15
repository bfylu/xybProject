package com.xyb.ai.service.impl;

//import com.xyb.ai.common.util.A;
import com.xyb.ai.mapper.xyb.MemberBillMapper;
import com.xyb.ai.model.xyb.MemberBill;
import com.xyb.ai.model.xyb.MemberBillExample;
import com.xyb.ai.service.MemberBillService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MemberBillServiceImpl implements MemberBillService {

    @Autowired
    private MemberBillMapper memberBillMapper;//这里会报错，但是并不会影响

    @Override
    public MemberBill selectByPrimaryKey(Long memberBillId) {
        return memberBillMapper.selectByPrimaryKey(memberBillId);
    }

    @Override
    public int deleteByPrimaryKey(Long memberBillId) {
        return memberBillMapper.deleteByPrimaryKey(memberBillId);
    }

    @Override
    public MemberBill insertSelective(MemberBill record) {
        int count = memberBillMapper.insertSelective(record);
        if (count == 0) {
            return null;
        }

        return record;
    }

    @Override
    public MemberBill updateByPrimaryKey(MemberBill record) {
        int count = memberBillMapper.updateByPrimaryKeySelective(record);
        if (count == 0) {
            return null;
        }

        return record;
    }

    @Override
    public List<MemberBill> selectByMemberNo(String memberNo) {
        MemberBillExample memberBillExample = new MemberBillExample();
        MemberBillExample.Criteria criteria = memberBillExample.createCriteria();
        criteria.andMemberNoEqualTo(memberNo);

        return memberBillMapper.selectByExample(memberBillExample);
    }
}
