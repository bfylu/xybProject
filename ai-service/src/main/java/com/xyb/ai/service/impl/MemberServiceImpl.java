package com.xyb.ai.service.impl;

import com.xyb.ai.mapper.xyb.MemberMapper;
import com.xyb.ai.model.xyb.Member;
import com.xyb.ai.model.xyb.MemberExample;
import com.xyb.ai.service.MemberService;
import com.xyb.common.util.A;
import org.springframework.beans.factory.annotation.Autowired;

public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberMapper memberMapper;//这里会报错，但是并不会影响

    @Override
    public Member selectByPrimaryKey(Long memberId) {
        return memberMapper.selectByPrimaryKey(memberId);
    }

    @Override
    public int deleteByPrimaryKey(Long memberId) {
        return memberMapper.deleteByPrimaryKey(memberId);
    }

    @Override
    public Member insertSelective(Member record) {
        int count = memberMapper.insertSelective(record);
        if (count == 0) {
            return null;
        }

        return record;
    }

    @Override
    public Member updateByPrimaryKey(Member record) {
        int count = memberMapper.updateByPrimaryKeySelective(record);
        if (count == 0) {
            return null;
        }

        return record;
    }

    @Override
    public Member selectByUserName(String memberNo) {
        MemberExample memberExample = new MemberExample();
        MemberExample.Criteria criteria = memberExample.createCriteria();
        criteria.andMemberNoEqualTo(memberNo);

        return A.first(memberMapper.selectByExample(memberExample));
    }
}
