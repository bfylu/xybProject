package com.xyb.shop.controller;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageHelper;
import com.xyb.common.BaseController;
import com.xyb.common.PageInfo;
import com.xyb.common.json.BaseResp;
import com.xyb.common.util.JsonUtil;
import com.xyb.shop.dto.UserCollectionDto;
import com.xyb.shop.model.xyb.Shop;
import com.xyb.shop.model.xyb.UserCollection;
import com.xyb.shop.service.GoodsService;
import com.xyb.shop.service.ShopService;
import com.xyb.shop.service.UserCollectionService;
import com.xyb.shop.vo.UserCollectionVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Api(tags = "关注商家")
@RestController
@RequestMapping(value = "userCollection")
public class UserCollectionController extends BaseController {

    @Autowired
    private UserCollectionService userCollectionService;

    @Autowired
    private GoodsService goodsService;

    @Autowired
    private ShopService shopService;


    @PostMapping("/add")
    @ApiOperation("收藏店铺接口 -> 李振伟")
    //@HystrixCommand(fallbackMethod = "addUserError")
    public BaseResp addUserCollection(UserCollectionDto userCollectionDto) {
        UserCollection userCollection = JsonUtil.convert(userCollectionDto, UserCollection.class);
        boolean ok = userCollectionService.insertSelective(userCollection);
        if (!ok) {
            return BaseResp.fail("收藏店铺失败");
        }
        return BaseResp.success("收藏店铺成功");
    }


    @GetMapping("/findByCondition")
    @ApiOperation("查询用户收藏的店铺信息 -> 李振伟")
    public BaseResp<PageInfo<UserCollectionVo>> getUserCollectionByPage(
            @ApiParam(name = "userId", value = "用户Id") @RequestParam(name = "userId", required = true) String userId,
            @ApiParam(name = "pageNum", value = "当前页") @RequestParam(name = "pageNum", required = false, defaultValue = "1") int pageNum,
            @ApiParam(name = "pageSize", value = "每页条数") @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize
    ) {
        List<UserCollection> userCollectionLists = userCollectionService.findByUserId(userId);

        //List去重
        List<UserCollection> setList= new ArrayList<>();
        Set<String> set= new HashSet<>();

        for (UserCollection userCollection : userCollectionLists) {
            if (userCollection == null) {
                continue;
            }
            String  merCode = userCollection.getMerCode();
            if (merCode != null) {
                if (!set.contains(merCode)) { //set中不包含重复的
                    set.add(merCode);
                    setList.add(userCollection);
                } else {
                    continue;
                }
            }
        }
        set.clear();

        PageHelper.startPage(pageNum, pageSize);
        PageInfo<UserCollection> pageInfoUserCollection = new PageInfo<>(setList);

        List<Map<String, String>> goodsList = new ArrayList<>();
        Map<String, String> goodsMap = new HashMap<>();
        //取出需要转换的页内容
        List<UserCollection> userCollectionList = pageInfoUserCollection.getList();//屏蔽一些字段，只显示TuserVo中的字段
        //屏蔽一些字段，只显示TuserVo中的字段
        List<UserCollectionVo> listUserCollectionVo = JsonUtil.convertList(userCollectionList, UserCollectionVo.class);
        for (UserCollectionVo userCollectionVo : listUserCollectionVo) {
            for (UserCollection s : userCollectionLists) {
               if (userCollectionVo.getMerCode().equals(s.getMerCode())){
                   JSONObject goodsInfo = JSONObject.parseObject(s.getGoodsInfo());
                   String refNo = goodsInfo.getString("refNo");
                   String primary = goodsInfo.getString("primary");
                   String goodsPrice = goodsInfo.getString("goodsPrice");
                   goodsMap.put("refNo", refNo);
                   goodsMap.put("primary", primary);
                   goodsMap.put("goodsPrice", goodsPrice);
                   goodsList.add(goodsMap);
               }
                }
            String shopGoodsInfo = "";
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                shopGoodsInfo =  objectMapper.writeValueAsString(goodsList);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            log.info(shopGoodsInfo);
            userCollectionVo.setShopHotGoodsList(shopGoodsInfo);
            Shop shop = shopService.queryFroMerCode(userCollectionVo.getMerCode());
            userCollectionVo.setShopLogo(shop.getShopLogo());
            userCollectionVo.setShopName(shop.getShopName());
            userCollectionVo.setShopNo(shop.getShopNo());
            userCollectionVo.setShopTotalSale(goodsService.countGoodsSale(userCollectionVo.getMerCode()));
        }

        //把原来的分页数据拷贝过来，如：当前页,每页的数量,总记录数,总页数,是否为第一页,是否为最后一页
        PageInfo<UserCollectionVo> pageInfoVo = JsonUtil.convert(pageInfoUserCollection, UserCollectionVo.class);
        //放入转换后的内容
        pageInfoVo.setList(listUserCollectionVo);
        return BaseResp.success("收藏店铺信息显示成功",pageInfoVo);
    }


}
