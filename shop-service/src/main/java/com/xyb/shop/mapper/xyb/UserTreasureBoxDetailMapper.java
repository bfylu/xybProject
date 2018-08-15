package com.xyb.shop.mapper.xyb;

import com.xyb.shop.model.xyb.UserTreasureBoxDetail;
import com.xyb.shop.model.xyb.UserTreasureBoxDetailExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserTreasureBoxDetailMapper {
    long countByExample(UserTreasureBoxDetailExample example);

    int deleteByExample(UserTreasureBoxDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserTreasureBoxDetail record);

    int insertSelective(UserTreasureBoxDetail record);

    List<UserTreasureBoxDetail> selectByExample(UserTreasureBoxDetailExample example);

    UserTreasureBoxDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserTreasureBoxDetail record, @Param("example") UserTreasureBoxDetailExample example);

    int updateByExample(@Param("record") UserTreasureBoxDetail record, @Param("example") UserTreasureBoxDetailExample example);

    int updateByPrimaryKeySelective(UserTreasureBoxDetail record);

    int updateByPrimaryKey(UserTreasureBoxDetail record);
}