package com.xyb.shop.mapper.xyb;

import com.xyb.shop.model.xyb.ActivityPrizeInfo;
import com.xyb.shop.model.xyb.ActivityPrizeInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ActivityPrizeInfoMapper {
    long countByExample(ActivityPrizeInfoExample example);

    int deleteByExample(ActivityPrizeInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ActivityPrizeInfo record);

    int insertSelective(ActivityPrizeInfo record);

    List<ActivityPrizeInfo> selectByExample(ActivityPrizeInfoExample example);

    ActivityPrizeInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ActivityPrizeInfo record, @Param("example") ActivityPrizeInfoExample example);

    int updateByExample(@Param("record") ActivityPrizeInfo record, @Param("example") ActivityPrizeInfoExample example);

    int updateByPrimaryKeySelective(ActivityPrizeInfo record);

    int updateByPrimaryKey(ActivityPrizeInfo record);
}