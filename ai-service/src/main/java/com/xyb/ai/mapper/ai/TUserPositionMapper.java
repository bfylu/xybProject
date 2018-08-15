package com.xyb.ai.mapper.ai;

import com.xyb.ai.model.ai.TUserPosition;
import com.xyb.ai.model.ai.TUserPositionExample;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface TUserPositionMapper {
    long countByExample(TUserPositionExample example);

    int deleteByExample(TUserPositionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TUserPosition record);

    int insertSelective(TUserPosition record);

    List<TUserPosition> selectByExample(TUserPositionExample example);

    TUserPosition selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TUserPosition record, @Param("example") TUserPositionExample example);

    int updateByExample(@Param("record") TUserPosition record, @Param("example") TUserPositionExample example);

    int updateByPrimaryKeySelective(TUserPosition record);

    int updateByPrimaryKey(TUserPosition record);

    //AI-获取在线人数
//    long getOnLinePeopleCount(@Param("maxLat") BigDecimal maxLat, @Param("minLat") BigDecimal minLat,
//                              @Param("maxLng") BigDecimal maxLng, @Param("minLng") BigDecimal minLng);

    //AI-获取以前浏览过商户的在线人数
    long getOnLinePeopleCount(@Param("merCode")String merCode);

    //AI-获取商家周围客户
    List<TUserPosition> getAroundCustomer(@Param("maxLat") BigDecimal maxLat, @Param("minLat") BigDecimal minLat,
                                       @Param("maxLng") BigDecimal maxLng, @Param("minLng") BigDecimal minLng);

    //AI-获取客户列表
    List<TUserPosition> selectCustomerList(String merCode);

    //AI-获取用户详情
    TUserPosition getNewCustomerINfo(@Param("userId")String userId,@Param("merCode")String merCode);
}