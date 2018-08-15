package com.xyb.ai.mapper.ai;

import com.xyb.ai.model.ai.TUserTrack;
import com.xyb.ai.model.ai.TUserTrackExample;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface TUserTrackMapper {
    long countByExample(TUserTrackExample example);

    int deleteByExample(TUserTrackExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TUserTrack record);

    int insertSelective(TUserTrack record);

    List<TUserTrack> selectByExample(TUserTrackExample example);

    TUserTrack selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TUserTrack record, @Param("example") TUserTrackExample example);

    int updateByExample(@Param("record") TUserTrack record, @Param("example") TUserTrackExample example);

    int updateByPrimaryKeySelective(TUserTrack record);

    int updateByPrimaryKey(TUserTrack record);

    //AI-获取在线人数
    long getOnLinePeopleCount(@Param("maxLat") BigDecimal maxLat, @Param("minLat") BigDecimal minLat,
                              @Param("maxLng") BigDecimal maxLng, @Param("minLng") BigDecimal minLng);

    //AI-获取商家周围客户
    List<TUserTrack> getAroundCustomer(@Param("maxLat") BigDecimal maxLat, @Param("minLat") BigDecimal minLat,
                                       @Param("maxLng") BigDecimal maxLng, @Param("minLng") BigDecimal minLng);

    //AI-获取客户列表
    List<TUserTrack> selectCustomerList(String merCode);

    //AI-获取用户详情
    TUserTrack getNewCustomerINfo(@Param("userId")String userId);
}