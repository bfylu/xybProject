package com.xyb.shop.controller;

import com.xyb.common.BaseController;
import com.xyb.common.json.BaseResp;
import com.xyb.common.util.U;
import com.xyb.shop.util.OpenIdUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author bfy--lujian
 * @version 1.0.0
 * 创建时间：2018/7/13
 * @email bfyjian@gmail.com
 */

@Api(tags = "微信小程序接口")
@Controller
@RequestMapping("member")
public class MemberController extends BaseController {

    private static final long serialVersionUID = 1L;

    @ApiOperation("登录接口")
    @PostMapping("/wechatUserLogin")
    public BaseResp wechatUserLogin(@ApiParam("登录凭证不能为空") @RequestParam String code,
                                    @ApiParam("encryptedData") @RequestParam String encryptedData,
                                    @ApiParam("iv") @RequestParam String iv){
        //登录凭证不能为空
        if (U.isBlank(code)) {
            return BaseResp.fail("报文字段不能为空");
        }
        /* String wxspAppid = "wx12b2f0186f110bf6";
	    //小程序的 app secret (在微信小程序管理后台获取)
	    String wxspSecret = "f53a84cc5ec7d44030a3df33e3e35214"; */

        /* //小程序唯一标识   (在微信小程序管理后台获取)
	    String wxspAppid = payCfg.getXYSQAppid();
	    //小程序的 app secret (在微信小程序管理后台获取)
	    String wxspSecret = payCfg.getXYSQSecret(); */
        //授权（必填）
        String grant_type = "authorization_code";
        //////////////// 1、向微信服务器 使用登录凭证 code 获取 session_key 和 openid ////////////////
        //请求参数
        // String params = "appid=" + wxspAppid + "&secret=" + wxspSecret + "&js_code=" + code + "&grant_type=" + grant_type;

        //如果有code，说明是微信小程序，根据code获取openId
        //classify用于标识是哪个小程序
        if (U.isBlank(code)) {
            String classify = "1";
            String openid = OpenIdUtil.oauth2GetOpenid(code, classify);
            log.info(code,MemberController.this);
            log.info(openid,MemberController.this);
        }




        return BaseResp.success("成功");
    }
}
