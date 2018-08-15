package com.xyb.ai.mapper.xyb;

import com.xyb.ai.model.xyb.AeonUserInfo;
import com.xyb.ai.model.xyb.AeonUserInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AeonUserInfoMapper {
    long countByExample(AeonUserInfoExample example);

    int deleteByExample(AeonUserInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AeonUserInfo record);

    int insertSelective(AeonUserInfo record);

    List<AeonUserInfo> selectByExample(AeonUserInfoExample example);

    AeonUserInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AeonUserInfo record, @Param("example") AeonUserInfoExample example);

    int updateByExample(@Param("record") AeonUserInfo record, @Param("example") AeonUserInfoExample example);

    int updateByPrimaryKeySelective(AeonUserInfo record);

    int updateByPrimaryKey(AeonUserInfo record);
}