package com.xyb.ai.controller;

import com.xyb.ai.common.TlsSig;
import com.xyb.ai.model.ai.TImUser;
import com.xyb.ai.service.TImUserService;
import com.xyb.ai.vo.TIMUserVo;
import com.xyb.ai.vo.TlsIdAndSigVo;
import com.xyb.common.BaseController;
import com.xyb.common.json.BaseResp;
import com.xyb.common.util.A;
import com.xyb.common.util.JsonUtil;
import com.xyb.common.util.U;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.URLDecoder;
import java.util.List;

@Api(tags = "即时通讯接口")
@RestController
@RequestMapping(value = "/tls")
public class TlsController extends BaseController {
    @Autowired
    private TlsSig tlsSig;

    @Autowired
    private TImUserService tImUserService;

    @GetMapping("/genTlsSig")
    @ApiOperation("得到TLS sig签名数据 -> 陈旭东")
    public BaseResp genTlsSig(String identifier) throws Exception {
        String strSig = tlsSig.genTlsSig(identifier);
        if (U.isBlank(strSig)) {
            return BaseResp.fail("TLS Sig数据為空");
        }

        return BaseResp.success("TLS Sig数据", strSig);
    }

    @GetMapping("/checkTls")
    @ApiOperation("校验TLS签名数据 -> 陈旭东")
    public BaseResp checkTls(String identifier, String strSig) throws Exception {
        boolean bol = tlsSig.checkTlsSig(identifier, strSig);
        if (!bol) {
            return BaseResp.fail("TLS Sig校验失敗");
        }

        return BaseResp.success("TLS Sig校验成功");
    }

    @GetMapping("/accountImport")
    @ApiOperation("独立模式账号导入接口 -> 陈旭东")
    public BaseResp accountImport(String identifier, String nick, String faceUrl) throws Exception {
        boolean bol = tlsSig.accountImport(identifier, nick, faceUrl);
        if (!bol) {
            return BaseResp.fail("TLS导入账号失败");
        }

        return BaseResp.success("TLS导入账号成功");
    }

    @GetMapping("/accountImportAndReturnSig")
    @ApiOperation("独立模式账号导入并返回Id和签名接口 -> 陈旭东")
    public BaseResp<TlsIdAndSigVo> accountImportAndReturnSig(String identifier, String nick, String faceUrl) throws Exception {
        TlsIdAndSigVo tlsIdAndSigVo = tImUserService.accountImportAndReturnSig(identifier, nick, faceUrl);
        if (U.isBlank(tlsIdAndSigVo)) {
            return BaseResp.fail("TLS独立模式账号导入并返回Id和签名接口失败!");
        }

        return BaseResp.success("TLS独立模式账号导入并返回Id和签名接口成功!",tlsIdAndSigVo);
    }

    @PostMapping("/getImUserList")
    @ApiOperation("获取IM注册用户接口 -> 陈旭东")
    public BaseResp<List<TIMUserVo>> getImUserList(@RequestBody List<String> userId) throws Exception {
        List<TImUser> listImUser = tImUserService.findByUserId(userId);
        if (A.isEmpty(listImUser)) {
            return BaseResp.fail("获取IM注册用户接口失败!");
        }
        List<TIMUserVo> listImTUserVo = JsonUtil.convertList(listImUser, TIMUserVo.class);

        for(TIMUserVo tIMUserVo:listImTUserVo) {
            String nickName =  URLDecoder.decode(tIMUserVo.getNick(), "utf-8");
            tIMUserVo.setNick(nickName);
        }

        return BaseResp.success("获取IM注册用户接口成功!",listImTUserVo);
    }
}