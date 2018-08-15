package com.xyb.ai.service;

import com.xyb.ai.dto.TChatExtendsTUserTrackDto;
import com.xyb.ai.model.ai.TUserChat;
import com.xyb.common.PageInfo;

public interface TUserChatService {
    TUserChat selectByPrimaryKey(Long id);

    int deleteByPrimaryKey(Long id);

    TUserChat insertSelective(TUserChat record);

    TUserChat updateByPrimaryKey(TUserChat record);

    /**
     * 多条件查询，找出符合条件的记录
     * @param record   用户信息
     * @param pageNum  页号
     * @param pageSize 每页显示记录数
     * @return
     */
    PageInfo<TUserChat> findByCondition(TUserChat record, int pageNum, int pageSize);


    /**
     * 获取AI客户聊天列表
     * @param merCode
     */
    PageInfo<TChatExtendsTUserTrackDto> getMerChatList(String merCode, int pageNum, int pageSize);

}
