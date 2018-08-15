package com.xyb.ai.service;

import com.xyb.ai.dto.UserAndActionDto;
import com.xyb.ai.model.ai.TUserAction;
import com.xyb.common.PageInfo;

import java.io.UnsupportedEncodingException;

public interface TUserActionService {

    /**
     * 添加用户行为(同时更新用户行为记录)
     *
     * @param record
     * @return
     */
    boolean insertSelective(TUserAction record);


    /**
     * 获取AI-用户行为记录
     * @param merCode
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageInfo<UserAndActionDto> getActionRecord(String merCode, int pageNum, int pageSize) throws UnsupportedEncodingException;

}
