package com.xyb.shop.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.xyb.common.util.U;
import com.xyb.shop.dto.GoodsDto;
import com.xyb.shop.mapper.xyb.UserCollectionMapper;
import com.xyb.shop.model.xyb.UserCollection;
import com.xyb.shop.model.xyb.UserCollectionExample;
import com.xyb.shop.service.UserCollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;


@Service(value = "UserCollectionService")
@CacheConfig(cacheNames = "UserCollection")
public class UserCollectionServiceImpl implements UserCollectionService {

    @Autowired
    private UserCollectionMapper userCollectionMapper;

    @Autowired
    private GoodsServiceImpl goodsService;

    @Override
    //@CachePut(key = "#result.id", unless = "#result == null")
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public boolean insertSelective(UserCollection record) {
        try {
            UserCollectionExample userCollectionExample = new UserCollectionExample();
            UserCollectionExample.Criteria criteria = userCollectionExample.createCriteria();
            if (U.isNotBlank(record.getMerCode())) {
                criteria.andMerCodeEqualTo(record.getMerCode());
            }
            if (U.isNotBlank(record.getOpenId())) {
                criteria.andOpenIdEqualTo(record.getOpenId());
            }
            List<UserCollection> userCollectionList = userCollectionMapper.selectByExample(userCollectionExample);
            if (userCollectionList.size() > 1 ) {
                return false;
            }
            GoodsDto condition = new GoodsDto();
            if (U.isNotBlank(record.getMerCode())) {
                condition.setMerCode(record.getMerCode());
            }
            condition.setSortRule(true);
            List<GoodsDto> goodsDtoList = goodsService.findByCondition(condition);
            if (U.isBlank(goodsDtoList)) {
                return false;
            }
            for (GoodsDto goodsDto : goodsDtoList) {
                JSONObject goodsPic;
                goodsPic = JSONObject.parseObject(goodsDto.getGoodsPic());
                String primary = goodsPic.getString("primary");
                JSONObject goodsInfoJson = new JSONObject();
                goodsInfoJson.put("primary", null == primary ? "" : primary);
                goodsInfoJson.put("refNo", null == goodsDto.getRefNo() ? "" : goodsDto.getRefNo());
                goodsInfoJson.put("goodsPrice", null == goodsDto.getGoodsPic() ? "" : goodsDto.getGoodsPrice());
                record.setGoodsInfo(goodsInfoJson.toJSONString());
                record.setIsCollection("Y");
                record.setCreateDt(new Date());
                int count = userCollectionMapper.insertSelective(record);
                if (U.isBlank(count)) {
                    throw new RuntimeException();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();

        }
        return true;
    }

    @Override
    public List<UserCollection> findByUserId(String openId) {
        UserCollectionExample userCollectionExample = new UserCollectionExample();
        UserCollectionExample.Criteria criteria = userCollectionExample.createCriteria();
        if (U.isNotBlank(openId)) {
            criteria.andOpenIdEqualTo(openId);
        }
        List<UserCollection> userCollectionList = userCollectionMapper.selectByExample(userCollectionExample);
//        PageHelper.startPage(pageNum, pageSize);
//        PageInfo<UserCollection> pageInfoUserCollection = new PageInfo<>(userCollectionList);
//        return pageInfoUserCollection;
        return userCollectionList;
    }
}
