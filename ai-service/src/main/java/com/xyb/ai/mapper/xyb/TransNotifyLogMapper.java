package com.xyb.ai.mapper.xyb;

import com.xyb.ai.model.xyb.TransNotifyLog;
import com.xyb.ai.model.xyb.TransNotifyLogExample;
import com.xyb.ai.model.xyb.TransNotifyLogWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TransNotifyLogMapper {
    long countByExample(TransNotifyLogExample example);

    int deleteByExample(TransNotifyLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TransNotifyLogWithBLOBs record);

    int insertSelective(TransNotifyLogWithBLOBs record);

    List<TransNotifyLogWithBLOBs> selectByExampleWithBLOBs(TransNotifyLogExample example);

    List<TransNotifyLog> selectByExample(TransNotifyLogExample example);

    TransNotifyLogWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TransNotifyLogWithBLOBs record, @Param("example") TransNotifyLogExample example);

    int updateByExampleWithBLOBs(@Param("record") TransNotifyLogWithBLOBs record, @Param("example") TransNotifyLogExample example);

    int updateByExample(@Param("record") TransNotifyLog record, @Param("example") TransNotifyLogExample example);

    int updateByPrimaryKeySelective(TransNotifyLogWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TransNotifyLogWithBLOBs record);

    int updateByPrimaryKey(TransNotifyLog record);
}