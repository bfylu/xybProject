package com.xyb.ai.service.impl;

import com.xyb.ai.mapper.xyb.GoodsMapper;
import com.xyb.ai.model.xyb.Goods;
import com.xyb.ai.model.xyb.GoodsExample;
import com.xyb.ai.service.GoodsService;
import com.xyb.common.util.U;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "GoodsService")
@CacheConfig(cacheNames = "Goods")
public class GoodsServiceimpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public List<Goods> findByCondition(Goods goods) {
        GoodsExample exGoods = new GoodsExample();
        GoodsExample.Criteria criteria = exGoods.createCriteria();
        if (U.isNotBlank(goods.getRefNo())) {
            criteria.andRefNoEqualTo(goods.getRefNo());
        }
        if (U.isNotBlank(goods.getId())) {
            criteria.andIdEqualTo(goods.getId());
        }
        if (U.isNotBlank(goods.getMerCode())) {
            criteria.andMerCodeEqualTo(goods.getMerCode());
        }
        List<Goods> goodsList = goodsMapper.selectByExample(exGoods);

        return goodsList;
    }
}
