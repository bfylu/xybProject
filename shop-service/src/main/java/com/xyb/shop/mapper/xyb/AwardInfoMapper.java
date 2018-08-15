package com.xyb.shop.mapper.xyb;

import com.xyb.shop.model.xyb.AwardInfo;
import com.xyb.shop.model.xyb.AwardInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AwardInfoMapper {
    long countByExample(AwardInfoExample example);

    int deleteByExample(AwardInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AwardInfo record);

    int insertSelective(AwardInfo record);

    List<AwardInfo> selectByExample(AwardInfoExample example);

    AwardInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AwardInfo record, @Param("example") AwardInfoExample example);

    int updateByExample(@Param("record") AwardInfo record, @Param("example") AwardInfoExample example);

    int updateByPrimaryKeySelective(AwardInfo record);

    int updateByPrimaryKey(AwardInfo record);
}