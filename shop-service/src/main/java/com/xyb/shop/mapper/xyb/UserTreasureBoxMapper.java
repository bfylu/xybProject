package com.xyb.shop.mapper.xyb;

import com.xyb.shop.model.xyb.UserTreasureBox;
import com.xyb.shop.model.xyb.UserTreasureBoxExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserTreasureBoxMapper {
    long countByExample(UserTreasureBoxExample example);

    int deleteByExample(UserTreasureBoxExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserTreasureBox record);

    int insertSelective(UserTreasureBox record);

    List<UserTreasureBox> selectByExample(UserTreasureBoxExample example);

    UserTreasureBox selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserTreasureBox record, @Param("example") UserTreasureBoxExample example);

    int updateByExample(@Param("record") UserTreasureBox record, @Param("example") UserTreasureBoxExample example);

    int updateByPrimaryKeySelective(UserTreasureBox record);

    int updateByPrimaryKey(UserTreasureBox record);
}