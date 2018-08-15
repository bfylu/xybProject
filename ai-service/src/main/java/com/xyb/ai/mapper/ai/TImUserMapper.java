package com.xyb.ai.mapper.ai;

import com.xyb.ai.model.ai.TImUser;
import com.xyb.ai.model.ai.TImUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TImUserMapper {
    long countByExample(TImUserExample example);

    int deleteByExample(TImUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TImUser record);

    int insertSelective(TImUser record);

    List<TImUser> selectByExample(TImUserExample example);

    TImUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TImUser record, @Param("example") TImUserExample example);

    int updateByExample(@Param("record") TImUser record, @Param("example") TImUserExample example);

    int updateByPrimaryKeySelective(TImUser record);

    int updateByPrimaryKey(TImUser record);
}