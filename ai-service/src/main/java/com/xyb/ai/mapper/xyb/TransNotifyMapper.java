package com.xyb.ai.mapper.xyb;

import com.xyb.ai.model.xyb.TransNotify;
import com.xyb.ai.model.xyb.TransNotifyExample;
import com.xyb.ai.model.xyb.TransNotifyWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TransNotifyMapper {
    long countByExample(TransNotifyExample example);

    int deleteByExample(TransNotifyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TransNotifyWithBLOBs record);

    int insertSelective(TransNotifyWithBLOBs record);

    List<TransNotifyWithBLOBs> selectByExampleWithBLOBs(TransNotifyExample example);

    List<TransNotify> selectByExample(TransNotifyExample example);

    TransNotifyWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TransNotifyWithBLOBs record, @Param("example") TransNotifyExample example);

    int updateByExampleWithBLOBs(@Param("record") TransNotifyWithBLOBs record, @Param("example") TransNotifyExample example);

    int updateByExample(@Param("record") TransNotify record, @Param("example") TransNotifyExample example);

    int updateByPrimaryKeySelective(TransNotifyWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TransNotifyWithBLOBs record);

    int updateByPrimaryKey(TransNotify record);
}