package com.xyb.ai.mapper.ai;

import com.xyb.ai.dto.TChatExtendsTUserTrackDto;
import com.xyb.ai.model.ai.TUserChat;
import com.xyb.ai.model.ai.TUserChatExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TUserChatMapper {
    long countByExample(TUserChatExample example);

    int deleteByExample(TUserChatExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TUserChat record);

    int insertSelective(TUserChat record);

    List<TUserChat> selectByExample(TUserChatExample example);

    TUserChat selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TUserChat record, @Param("example") TUserChatExample example);

    int updateByExample(@Param("record") TUserChat record, @Param("example") TUserChatExample example);

    int updateByPrimaryKeySelective(TUserChat record);

    int updateByPrimaryKey(TUserChat record);

    List<TChatExtendsTUserTrackDto> getChatPeopleList(String merCode);
}