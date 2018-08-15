package com.xyb.shop.service;

import com.xyb.shop.dto.GoodsDto;

import java.util.List;

public interface GoodsService {

    /**
     * 条件查询
     * @param record
     * @return
     */
    List<GoodsDto> findByCondition(GoodsDto record);

    /**
     * 根据商户编码查询商品销量
     * @param merCode
     * @return
     */
    long countGoodsSale(String merCode);
    long countRefNo(String merCode);
}
