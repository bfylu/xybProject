package com.xyb.shop.mapper.xyb;

import com.xyb.shop.model.xyb.MemberConsume;
import com.xyb.shop.model.xyb.MemberConsumeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MemberConsumeMapper {
    long countByExample(MemberConsumeExample example);

    int deleteByExample(MemberConsumeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MemberConsume record);

    int insertSelective(MemberConsume record);

    List<MemberConsume> selectByExample(MemberConsumeExample example);

    MemberConsume selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MemberConsume record, @Param("example") MemberConsumeExample example);

    int updateByExample(@Param("record") MemberConsume record, @Param("example") MemberConsumeExample example);

    int updateByPrimaryKeySelective(MemberConsume record);

    int updateByPrimaryKey(MemberConsume record);
}