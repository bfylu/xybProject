package com.xyb.ai.controller;

import com.xyb.ai.dto.TControlParamDto;
import com.xyb.ai.model.ai.TControlParam;
import com.xyb.ai.service.TControlParamService;
import com.xyb.ai.vo.TControlParamVo;
import com.xyb.common.BaseController;
import com.xyb.common.PageInfo;
import com.xyb.common.json.BaseResp;
import com.xyb.common.util.JsonUtil;
import com.xyb.common.util.U;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "控制参数接口")
@RestController
@RequestMapping(value = "/controlParam")
public class ControlParamController extends BaseController {

    @Autowired
    private TControlParamService tControlParamService;

    @PostMapping("/add")
    @ApiOperation("添加控制参数记录 -> 陈旭东")
    public BaseResp addTControlParam(TControlParamDto tControlParamDto) {
        //转换成需要显示的类型
        TControlParam tControlParam = JsonUtil.convert(tControlParamDto, TControlParam.class);
        TControlParam ok = tControlParamService.insertSelective(tControlParam);

        if (U.isBlank(ok)) {
            return BaseResp.fail("add控制参数信息失败");
        }

        log.info("Return ParamCode:" + ok.getParamCode());
        return BaseResp.success("添加控制参数记录成功");
    }

    @DeleteMapping("/delete")
    @ApiOperation("删除控制参数记录 -> 陈旭东")
    public BaseResp delTControlParam(@ApiParam("paramCode") @RequestParam String paramCode) {
        int ok = tControlParamService.deleteByPrimaryKey(paramCode);
        if (ok == 0) {
            return BaseResp.fail("删除控制参数信息失败");
        }

        return BaseResp.success("删除控制参数信息成功");
    }

    @PostMapping("/update")
    @ApiOperation("修改控制参数记录 -> 陈旭东")
    public BaseResp updateTControlParam(TControlParam tControlParam) {
        TControlParam TControlParam1 = tControlParamService.updateByPrimaryKey(tControlParam);
        if (U.isBlank(TControlParam1)) {
            return BaseResp.fail("修改控制参数信息失败");
        }
        return BaseResp.success("修改控制参数信息成功");
    }

    @GetMapping("/select")
    @ApiOperation("获取控制参数信息 -> 陈旭东")
    public BaseResp<TControlParamVo> selecTControlParam(@ApiParam("paramCode") @RequestParam String paramCode) {
        TControlParam tControlParam = tControlParamService.selectByPrimaryKey(paramCode);
        if (U.isBlank(tControlParam)) {
            return BaseResp.fail("无控制参数数据");
        }

        //转换成需要显示的类型
        TControlParamVo tControlParamVo = JsonUtil.convert(tControlParam, TControlParamVo.class);

        return BaseResp.success("获取控制参数信息成功", tControlParamVo);
    }

    @GetMapping("/findByCondition")
    @ApiOperation("根据条件查找控制参数信息 -> 陈旭东")
    public BaseResp<PageInfo<TControlParam>> findByCondition(TControlParam tControlParam,
                                                             @RequestParam(name = "pageNum", required = false, defaultValue = "1") int pageNum,
                                                             @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize) {
        PageInfo<TControlParam> pageInfoTControlParam = tControlParamService.findByCondition(tControlParam, pageNum, pageSize);
        if (U.isBlank(pageInfoTControlParam)) {
            return BaseResp.fail("无控制参数数据");
        }

        return BaseResp.success("根据条件查找控制参数信息成功", pageInfoTControlParam);
    }
}
