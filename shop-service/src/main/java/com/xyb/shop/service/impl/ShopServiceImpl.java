package com.xyb.shop.service.impl;

import com.github.pagehelper.PageHelper;
import com.xyb.common.PageInfo;
import com.xyb.common.util.A;
import com.xyb.common.util.U;
import com.xyb.shop.mapper.xyb.ShopMapper;
import com.xyb.shop.model.xyb.Shop;
import com.xyb.shop.model.xyb.ShopExample;
import com.xyb.shop.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * <p>商户信息表</p>
 */
@Service(value = "ShopService")
@CacheConfig(cacheNames = "Shop")
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopMapper shopMapper;

    /**
     * <p>根据商户merCode查询店铺信息</p>
     * @param merCode
     * @return
     */
    @Override
    public Shop queryFroMerCode(String merCode) {
        ShopExample shopExample = new ShopExample();
        ShopExample.Criteria criteria = shopExample.createCriteria();
        if (U.isBlank(merCode)) {
            return null;
        }
        criteria.andMerCodeEqualTo(merCode);
        List<Shop> shop = shopMapper.selectByExample(shopExample);
        return A.first(shop);
    }

    /**
     * <p>查询所有shop(商户)表的信息</p>
     * @return
     */
    @Override
    public PageInfo<Shop> queryAllShop(String username, Date dateStart, Date dateEnd, int pageNum, int pageSize) {
        ShopExample selectByExample = new ShopExample();
        ShopExample.Criteria criteria = selectByExample.createCriteria();
        if (U.isNotBlank(username)){
            criteria.andUsernameEqualTo(username);
        }
        if (U.isNotBlank(dateStart) && U.isNotBlank(dateEnd)) {
            criteria.andOpenTimeBetween(dateStart, dateEnd);
        }
        List<Shop> shopList=shopMapper.selectByExample(selectByExample);
        PageHelper.startPage(pageNum, pageSize);
        PageInfo<Shop> pageInfoTUser = new PageInfo<>(shopList);
        return pageInfoTUser;
    }

    @Override
    public Shop updateShopInfo(Shop shop) {
        return null;
    }
}
