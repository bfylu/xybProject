package com.xyb.ai.service;

import com.xyb.ai.model.xyb.Member;

public interface MemberService {
    Member selectByPrimaryKey(Long memberId);

    int deleteByPrimaryKey(Long memberId);

    Member insertSelective(Member record);

    Member updateByPrimaryKey(Member record);

    Member selectByUserName(String openid);
}
