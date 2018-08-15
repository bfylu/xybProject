package com.xyb.shop.service;

import com.xyb.shop.model.xyb.UserCollection;

import java.util.List;

public interface UserCollectionService {

    /**
     * 收藏店铺
     *
     * @param record
     * @return
     */
    boolean insertSelective(UserCollection record);

    /**
     * 查询用户收藏店铺
     *
     * @param userId
     * @return
     */
    List<UserCollection> findByUserId(String userId);

}
