package com.xyb.ai.service;

import com.xyb.ai.model.ai.TUser;
import com.xyb.common.PageInfo;

import java.util.List;

public interface TUserService {
    List<TUser> findAllTUser();

    TUser selectByPrimaryKey(Integer TUserId);

    int deleteByPrimaryKey(Integer TUserId);

    TUser insertSelective(TUser record);

    TUser updateByPrimaryKey(TUser record);

    /**
     * 分页查询
     *
     * @param pageNum  页号
     * @param pageSize 每页显示记录数
     * @return
     */
    PageInfo<TUser> findByPage(int pageNum, int pageSize);

    /**
     * 多条件查询，找出符合条件的记录
     * @param record   用户信息
     * @param pageNum  页号
     * @param pageSize 每页显示记录数
     * @return
     */
    PageInfo<TUser> findByCondition(TUser record, int pageNum, int pageSize);
}
