package com.xyb.shop.controller;

import com.xyb.common.BaseController;
import com.xyb.common.json.BaseResp;
import com.xyb.common.util.JsonUtil;
import com.xyb.common.util.U;
import com.xyb.shop.constant.RespInfo;
import com.xyb.shop.model.xyb.Shop;
import com.xyb.shop.service.ShopService;
import com.xyb.shop.vo.ShopVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@Api(tags = "商铺管理接口")
@RestController()
@RequestMapping(value = "/shopManage")
public class ShopManageController extends BaseController {

    @Autowired
    private ShopService shopService;

    @ApiOperation("获取商家店铺信息")
    @GetMapping("/getShopInfo")
    public BaseResp getShopInfo(@ApiParam("商户编号") @RequestParam("merCode") String merCode){
        if (U.isBlank(merCode)) {
            return BaseResp.fail(RespInfo.PARAM_NOT_NULL);
        }
        Shop shop=shopService.queryFroMerCode(merCode);
        if (U.isBlank(shop)) {
            return BaseResp.fail(RespInfo.GET_FAIL);
        }
        ShopVo shopVo = JsonUtil.convert(shop, ShopVo.class);

        return BaseResp.success(RespInfo.SUCCESS,shopVo);
    }

    @ApiOperation("修改商家店铺信息")
    @GetMapping("/updateShopInfo")
    public BaseResp updateShopInfo(@ApiParam("商户信息")  Shop shop,
                                   @RequestParam("files") MultipartFile[] files){

        if (U.isBlank(shop.getMerCode())||U.isBlank(shop.getLongitude())
                ||U.isBlank(shop.getLatitude())||U.isBlank(shop.getShopAddress())) {
            return BaseResp.fail(RespInfo.PARAM_NOT_NULL);
        }

        //修改图片
        if (null != files) {

        }
        Shop shopInfo = shopService.updateShopInfo(shop);
        if (null == shopInfo) {
            return BaseResp.fail(RespInfo.FAIL);
        }
        return BaseResp.success(RespInfo.SUCCESS);
    }
}
