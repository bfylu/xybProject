package com.xyb.ai.mapper.ai;

import com.xyb.ai.dto.UserAndActionCountDto;
import com.xyb.ai.model.ai.TUserActionCount;
import com.xyb.ai.model.ai.TUserActionCountExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TUserActionCountMapper {
    long countByExample(TUserActionCountExample example);

    int deleteByExample(TUserActionCountExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TUserActionCount record);

    int insertSelective(TUserActionCount record);

    List<TUserActionCount> selectByExample(TUserActionCountExample example);

    TUserActionCount selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TUserActionCount record, @Param("example") TUserActionCountExample example);

    int updateByExample(@Param("record") TUserActionCount record, @Param("example") TUserActionCountExample example);

    int updateByPrimaryKeySelective(TUserActionCount record);

    int updateByPrimaryKey(TUserActionCount record);

    TUserActionCount selectByCreateDt(Map record);

    //获取店铺潜在客户人数
    long getPeopleCount(@Param("merCode")String merCode);

    //获取访客动态信息
    List<UserAndActionCountDto> getVisitorDynamic(@Param("userId") String userId, @Param("merCode") String merCode);

}