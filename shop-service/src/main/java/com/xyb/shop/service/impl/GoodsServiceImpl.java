package com.xyb.shop.service.impl;

import com.xyb.common.util.U;
import com.xyb.shop.dto.GoodsDto;
import com.xyb.shop.mapper.xyb.GoodsMapper;
import com.xyb.shop.model.xyb.GoodsExample;
import com.xyb.shop.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "GoodsService")
@CacheConfig(cacheNames = "GoodsDto")
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    /**
     * <p>根据</p>
     * @param record
     * @return
     */
    @Override
    public List<GoodsDto> findByCondition(GoodsDto record) {
        List<GoodsDto> goodsDtoList = goodsMapper.findByCondition(record);
        return goodsDtoList;
    }

    /**
     * <p>根据商户的merCode查询该商户的上架商品数量</p>
     */

    public long countRefNo(String merCode) {
        if (U.isBlank(merCode)){
            return 0;
        }
        GoodsExample goodsExample = new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        criteria.andMerCodeEqualTo(merCode);

        long goodsCount = goodsMapper.countByExample(goodsExample);
        return goodsCount;
    }

    /***
     * <P>根据商户merCode查询该商户的所以商品总销量</P>
     * @param merCode
     * @return
     */
    @Override
    public long countGoodsSale(String merCode) {
        if (U.isBlank(merCode)) {
            return 0;
        }
        long saleCount = goodsMapper.countGoodsSale(merCode);
        return saleCount;
    }
}
