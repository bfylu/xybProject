package com.xyb.shop.mapper.xyb;

import com.xyb.shop.model.xyb.AppLoginKey;
import com.xyb.shop.model.xyb.AppLoginKeyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AppLoginKeyMapper {
    long countByExample(AppLoginKeyExample example);

    int deleteByExample(AppLoginKeyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AppLoginKey record);

    int insertSelective(AppLoginKey record);

    List<AppLoginKey> selectByExample(AppLoginKeyExample example);

    AppLoginKey selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AppLoginKey record, @Param("example") AppLoginKeyExample example);

    int updateByExample(@Param("record") AppLoginKey record, @Param("example") AppLoginKeyExample example);

    int updateByPrimaryKeySelective(AppLoginKey record);

    int updateByPrimaryKey(AppLoginKey record);
}