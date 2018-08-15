package com.xyb.shop.controller;

import com.xyb.common.PageInfo;
import com.xyb.common.json.BaseResp;
import com.xyb.common.util.JsonUtil;
import com.xyb.common.util.U;
import com.xyb.shop.model.xyb.Shop;
import com.xyb.shop.service.GoodsService;
import com.xyb.shop.service.ShopService;
import com.xyb.shop.vo.ShopRecommendVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author bfy--lujian
 * @version 1.0.0
 * 创建时间：2018/7/17 14:16
 * @email bfyjian@gmail.com
 */
@Api(tags = "商户后台管理")
@RestController
@RequestMapping(value = "admin/shop")
public class ShopController {

    @Autowired
    private ShopService shopService;
    @Autowired
    private GoodsService goodsService;

    @ApiOperation("推荐管理 --> 卢健")
    @PostMapping("/getShopRecommend")
    public BaseResp<PageInfo<ShopRecommendVo>> getShopRecommend(@ApiParam("申请人姓名") @RequestParam(value = "username", required = false) String username,
                                                                @ApiParam("开始日期") @RequestParam(value = "dateStrat", required = false) String dateStrat,
                                                                @ApiParam("结束日期") @RequestParam(value = "dateEnd", required = false) String dateEnd,
                                                                @ApiParam("用户登录的凭证") @RequestParam(value = "sessionToken", required = false) String sessionToken,
                                                                @ApiParam("第几页") @RequestParam(value = "page", required = false, defaultValue = "0") int page,
                                                                @ApiParam("当前页数据的条数") @RequestParam(value = "pageSize", required = false, defaultValue = "10") int pageSize) throws ParseException {

        Date date1 = null;
        Date date2 = null;
        if (U.isNotBlank(dateStrat) && U.isNotBlank(dateEnd)) {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            //DateFormat df2= new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            date1 = df.parse(dateStrat);
            date2 = df.parse(dateEnd);
            System.out.println("dateStrat------>>>>>>>" + date1);
        }

        PageInfo<Shop> shopPageInfo = shopService.queryAllShop(username, date1, date2, page, pageSize);
        //取出需要转换的页内容
        List<Shop> shopList = shopPageInfo.getList();
        //屏蔽一些字段，只显示TuserVo中的字段
        List<ShopRecommendVo> shopRecommendVoList = JsonUtil.convertList(shopList, ShopRecommendVo.class);
        for (ShopRecommendVo shopRecommendVo : shopRecommendVoList) {
            System.out.println("MerCode--shopRecommendVo-->>>>" + shopRecommendVo.getMerCode());
            long countGoodsSale = goodsService.countGoodsSale(shopRecommendVo.getMerCode());
            long countGoods = goodsService.countRefNo(shopRecommendVo.getMerCode());
            System.out.println("countGoods----->>>" + countGoods);
            shopRecommendVo.setCountGoodsSale(countGoodsSale);
            shopRecommendVo.setCountGoods(countGoods);
        }
        //把原来的分页数据拷贝过来，如：当前页,每页的数量,总记录数,总页数,是否为第一页,是否为最后一页
        PageInfo<ShopRecommendVo> pageInfoVo = JsonUtil.convert(shopPageInfo, ShopRecommendVo.class);
        //放入转换后的内容
        pageInfoVo.setList(shopRecommendVoList);

        return BaseResp.success("获取所有商户信息成功", pageInfoVo);
    }
}
