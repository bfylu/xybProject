package com.xyb.ai.controller;

import com.xyb.ai.constant.CustomerScreenType;
import com.xyb.ai.dto.UserAndActionDto;
import com.xyb.ai.service.TUserPositionService;
import com.xyb.ai.vo.AiCustomerListVo;
import com.xyb.common.BaseController;
import com.xyb.common.PageInfo;
import com.xyb.common.json.BaseResp;
import com.xyb.common.util.JsonUtil;
import com.xyb.common.util.U;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api(tags = "AI客户名单接口")
@RestController
@RequestMapping(value = "/aiCustomerRoster")
public class AICustomerRosterController extends BaseController {

    @Autowired
    private TUserPositionService tUserPositionService;


    @ApiOperation("获取客户列表筛选条件 -> 张楠")
    @GetMapping("/getCustomerScreen")
    public BaseResp getCustomerScreen() {
        ArrayList<Map> list = new ArrayList<>();
        for (CustomerScreenType customerScreenType : CustomerScreenType.values()) {
            Map<String, String> map = new HashMap<>();
            if (1 == customerScreenType.getValue()) {
                map.put("number", customerScreenType.getValue() + "");
                map.put("desc", customerScreenType.getDesc());
                list.add(map);
            }
            if (4 == customerScreenType.getValue()) {
                map.put("number", customerScreenType.getValue() + "");
                map.put("desc", customerScreenType.getDesc());
                list.add(map);
            }
        }
        System.out.println(list.toString());
        return BaseResp.success("成功", list);
    }


    @ApiOperation("获取客户列表 -> 张楠")
    @GetMapping("/getCustomerList")
    public BaseResp getCustomerList(@ApiParam("商户编号") @RequestParam("merCode") String merCode,
                                    @RequestParam(name = "screen", required = false, defaultValue = "1") int screen,
                                    @RequestParam(name = "pageNum", required = false, defaultValue = "1") int pageNum,
                                    @RequestParam(name = "pageSize", required = false, defaultValue = "25") int pageSize) {
        if (U.isBlank(merCode)) {
            return BaseResp.fail("商户编码不能为空");
        }
        PageInfo<UserAndActionDto> pageInfo = tUserPositionService.getCustomerList(merCode, pageNum, pageSize, screen);
        if (null == pageInfo) {
            JSONObject jsonObject = new JSONObject();
            return BaseResp.success("成功", jsonObject);
        }
        List<UserAndActionDto> list = pageInfo.getList();
        List<AiCustomerListVo> aiCustomerListVos = JsonUtil.convertList(list, AiCustomerListVo.class);
        PageInfo infoVo = JsonUtil.convert(pageInfo, AiCustomerListVo.class);
        infoVo.setList(aiCustomerListVos);
        return BaseResp.success("获取客户列表成功", infoVo);
    }

}
