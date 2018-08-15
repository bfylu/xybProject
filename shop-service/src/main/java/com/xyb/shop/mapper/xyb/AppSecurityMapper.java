package com.xyb.shop.mapper.xyb;

import com.xyb.shop.model.xyb.AppSecurity;
import com.xyb.shop.model.xyb.AppSecurityExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AppSecurityMapper {
    long countByExample(AppSecurityExample example);

    int deleteByExample(AppSecurityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AppSecurity record);

    int insertSelective(AppSecurity record);

    List<AppSecurity> selectByExample(AppSecurityExample example);

    AppSecurity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AppSecurity record, @Param("example") AppSecurityExample example);

    int updateByExample(@Param("record") AppSecurity record, @Param("example") AppSecurityExample example);

    int updateByPrimaryKeySelective(AppSecurity record);

    int updateByPrimaryKey(AppSecurity record);
}