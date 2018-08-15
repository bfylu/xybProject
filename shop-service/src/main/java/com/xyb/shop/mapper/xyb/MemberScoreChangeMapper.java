package com.xyb.shop.mapper.xyb;

import com.xyb.shop.model.xyb.MemberScoreChange;
import com.xyb.shop.model.xyb.MemberScoreChangeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MemberScoreChangeMapper {
    long countByExample(MemberScoreChangeExample example);

    int deleteByExample(MemberScoreChangeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MemberScoreChange record);

    int insertSelective(MemberScoreChange record);

    List<MemberScoreChange> selectByExample(MemberScoreChangeExample example);

    MemberScoreChange selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MemberScoreChange record, @Param("example") MemberScoreChangeExample example);

    int updateByExample(@Param("record") MemberScoreChange record, @Param("example") MemberScoreChangeExample example);

    int updateByPrimaryKeySelective(MemberScoreChange record);

    int updateByPrimaryKey(MemberScoreChange record);
}