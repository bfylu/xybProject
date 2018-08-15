package com.xyb.ai.service;

import com.github.pagehelper.PageInfo;
import com.xyb.ai.dto.*;
import com.xyb.ai.model.ai.TUserActionCount;

import java.io.UnsupportedEncodingException;

public interface AICustomerService {


    /**
     * 获取店铺的在线人数和潜在客户
     * @param merCdoe
     */
    PeopleCountDto getPeopleCount(String merCdoe,String distance);

    /**
     * 获取商户和客户的相对位置
     *
     * @param userId 商户id
     * @return
     */
    RelativePositionDto getRelativePosition(String userId,String distance);

    /**
     * 获取用户行为记录
     * @param merCode
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageInfo<FieldExtendsTrack> getActionRecord(String merCode, int pageNum, int pageSize) throws UnsupportedEncodingException;


    /**
     * 获取客户列表
     * @param merCode
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageInfo<FieldExtendsTrack> getCustomerList(String merCode, int pageNum, int pageSize);


    /**
     * 查询用户详情
     * @param id
     * @param merCode
     * @return
     */
    FieldExtendsTrack getCustomerInfo(String id,String merCode);


    /**
     * 查询用户访问动态
     * @param tUserActionCount
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageInfo<FieldExtendsTUserActionCount> getVisitorDynamic(TUserActionCount tUserActionCount, int pageNum, int pageSize);


    /**
     * 获取客户聊天列表
     * @param merCode
     */
    PageInfo<TChatExtendsTUserTrackDto> getMerChatList(String merCode, int pageNum, int pageSize);


}
