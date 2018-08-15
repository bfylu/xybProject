package com.xyb.ai.mapper.xyb;

import com.xyb.ai.model.xyb.MemberScore;
import com.xyb.ai.model.xyb.MemberScoreExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MemberScoreMapper {
    long countByExample(MemberScoreExample example);

    int deleteByExample(MemberScoreExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MemberScore record);

    int insertSelective(MemberScore record);

    List<MemberScore> selectByExample(MemberScoreExample example);

    MemberScore selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MemberScore record, @Param("example") MemberScoreExample example);

    int updateByExample(@Param("record") MemberScore record, @Param("example") MemberScoreExample example);

    int updateByPrimaryKeySelective(MemberScore record);

    int updateByPrimaryKey(MemberScore record);
}