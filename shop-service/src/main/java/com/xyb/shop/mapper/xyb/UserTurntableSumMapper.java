package com.xyb.shop.mapper.xyb;

import com.xyb.shop.model.xyb.UserTurntableSum;
import com.xyb.shop.model.xyb.UserTurntableSumExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserTurntableSumMapper {
    long countByExample(UserTurntableSumExample example);

    int deleteByExample(UserTurntableSumExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserTurntableSum record);

    int insertSelective(UserTurntableSum record);

    List<UserTurntableSum> selectByExample(UserTurntableSumExample example);

    UserTurntableSum selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserTurntableSum record, @Param("example") UserTurntableSumExample example);

    int updateByExample(@Param("record") UserTurntableSum record, @Param("example") UserTurntableSumExample example);

    int updateByPrimaryKeySelective(UserTurntableSum record);

    int updateByPrimaryKey(UserTurntableSum record);
}