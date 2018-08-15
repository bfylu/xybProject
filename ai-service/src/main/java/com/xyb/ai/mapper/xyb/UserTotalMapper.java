package com.xyb.ai.mapper.xyb;

import com.xyb.ai.model.xyb.UserTotal;
import com.xyb.ai.model.xyb.UserTotalExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserTotalMapper {
    long countByExample(UserTotalExample example);

    int deleteByExample(UserTotalExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserTotal record);

    int insertSelective(UserTotal record);

    List<UserTotal> selectByExample(UserTotalExample example);

    UserTotal selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserTotal record, @Param("example") UserTotalExample example);

    int updateByExample(@Param("record") UserTotal record, @Param("example") UserTotalExample example);

    int updateByPrimaryKeySelective(UserTotal record);

    int updateByPrimaryKey(UserTotal record);
}