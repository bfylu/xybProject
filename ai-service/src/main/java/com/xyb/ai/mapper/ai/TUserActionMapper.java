package com.xyb.ai.mapper.ai;

import com.xyb.ai.dto.UserAndActionDto;
import com.xyb.ai.model.ai.TUserAction;
import com.xyb.ai.model.ai.TUserActionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface TUserActionMapper {
    long countByExample(TUserActionExample example);

    int deleteByExample(TUserActionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TUserAction record);

    int insertSelective(TUserAction record);

    List<TUserAction> selectByExample(TUserActionExample example);

    TUserAction selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TUserAction record, @Param("example") TUserActionExample example);

    int updateByExample(@Param("record") TUserAction record, @Param("example") TUserActionExample example);

    int updateByPrimaryKeySelective(TUserAction record);

    int updateByPrimaryKey(TUserAction record);

    //查询用户行为记录信息
    List<UserAndActionDto> selectTUserActionInfoByMerCode(String merCode);



}