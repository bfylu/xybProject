package com.xyb.ai.mapper.xyb;

import com.xyb.ai.model.xyb.Ad;
import com.xyb.ai.model.xyb.AdExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdMapper {
    long countByExample(AdExample example);

    int deleteByExample(AdExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Ad record);

    int insertSelective(Ad record);

    List<Ad> selectByExample(AdExample example);

    Ad selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Ad record, @Param("example") AdExample example);

    int updateByExample(@Param("record") Ad record, @Param("example") AdExample example);

    int updateByPrimaryKeySelective(Ad record);

    int updateByPrimaryKey(Ad record);
}