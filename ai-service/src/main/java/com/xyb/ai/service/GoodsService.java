package com.xyb.ai.service;

import com.xyb.ai.model.xyb.Goods;

import java.util.List;

public interface GoodsService {

    /**
     * 根据商品refNo或id查询商品信息
     * @param goods
     * @return
     */
    List<Goods> findByCondition(Goods goods);
}
