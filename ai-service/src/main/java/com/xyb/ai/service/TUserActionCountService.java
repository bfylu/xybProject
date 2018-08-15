package com.xyb.ai.service;

import com.xyb.ai.dto.UserAndActionCountDto;
import com.xyb.ai.model.ai.TUserActionCount;
import com.xyb.common.PageInfo;

import java.util.Map;

public interface TUserActionCountService {

    /**
     * 查询某一天是否存在用户行为记录
     *
     * @return
     */
    TUserActionCount selectByCreateDt(Map record);

    /**
     * 添加用户行为记录
     *
     * @param record
     * @return
     */
    TUserActionCount insertSelective(TUserActionCount record);

    /**
     * 更新用户行为记录
     *
     * @param record
     * @return
     */
    TUserActionCount updateByPrimaryKey(TUserActionCount record);


    /**
     * 查询用户访问记录
     * @param tUserActionCount
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageInfo<UserAndActionCountDto> getVisitorDynamic(TUserActionCount tUserActionCount, int pageNum, int pageSize);


}
