package com.xyb.ai.service;

import com.xyb.ai.dto.PeopleCountDto;
import com.xyb.ai.dto.RelativePositionDto;
import com.xyb.ai.dto.UserAndActionDto;
import com.xyb.common.PageInfo;

public interface TUserPositionService {

    /**
     * AI-获取店铺的在线人数和潜在客户
     * @param merCode  商户编号
     * @param distance 商户周边距离,半径,M
     */
    PeopleCountDto getPeopleCount(String merCode, String distance);

    /**
     * AI-获取商户周边用户
     * @param userId   商户id
     * @param distance 距离 ,半径, M
     * @return
     */
    RelativePositionDto getRelativePosition(String userId, String distance);

    /**
     * AI-获取客户列表
     * @param merCode
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageInfo<UserAndActionDto> getCustomerList(String merCode, int pageNum, int pageSize, int screen);

    /**
     * AI-获取用户最新信息详情
     * @param id
     * @return
     */
    UserAndActionDto getCustomerInfo(String id, String merCode);
}
