package com.xyb.shop.service;

import com.xyb.common.PageInfo;
import com.xyb.shop.model.xyb.Shop;

import java.util.Date;

public interface ShopService {

    /**
     * 根据商户编码查询店铺信息
     * @param merCode
     * @return
     */
    Shop queryFroMerCode(String merCode);

    PageInfo<Shop> queryAllShop(String username, Date dateStart, Date dateEnd, int pageNum, int pageSize);


    /**
     * 修改店铺信息
     * @param shop
     * @return
     */
    Shop updateShopInfo(Shop shop);

}
