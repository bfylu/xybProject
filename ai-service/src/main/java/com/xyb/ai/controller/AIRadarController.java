package com.xyb.ai.controller;

import com.xyb.ai.dto.PeopleCountDto;
import com.xyb.ai.dto.RelativePositionDto;
import com.xyb.ai.dto.UserAndActionDto;
import com.xyb.ai.service.TUserActionService;
import com.xyb.ai.service.TUserPositionService;
import com.xyb.ai.vo.AiActionRecordVo;
import com.xyb.common.BaseController;
import com.xyb.common.PageInfo;
import com.xyb.common.json.BaseResp;
import com.xyb.common.util.JsonUtil;
import com.xyb.common.util.U;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.util.List;

@Api(tags = "AI客户雷达接口")
@RestController
@RequestMapping(value = "/aiRadar")
public class AIRadarController extends BaseController {

    @Autowired
    private TUserActionService tUserActionService;

    @Autowired
    private TUserPositionService tUserPositionService;


    @ApiOperation("获取店铺在线人数和总人数 -> 张楠")
    @GetMapping("/getPeopleNumber")
    public BaseResp getPeopleNumber(@ApiParam("商户编号") @RequestParam("merCode") String merCode,
                                    @ApiParam("范围,半径,表示多少米") @RequestParam(name = "distance", required = false, defaultValue = "5000") String distance) {
        if (U.isBlank(merCode)) {
            return BaseResp.fail("商户编号不能为空");
        }
        PeopleCountDto peopleCount = tUserPositionService.getPeopleCount(merCode, distance);
        return BaseResp.success("获取人数成功", peopleCount);
    }


    @ApiOperation("获取商户周边用户 -> 张楠")
    @GetMapping("/getRelativePosition")
    public BaseResp getRelativePosition(@ApiParam("商户编号") @RequestParam("merCode") String userId,
                                        @ApiParam("范围,半径,表示多少米") @RequestParam(name = "distance", required = false, defaultValue = "5000") String distance) {
        if (U.isBlank(userId)) {
            return BaseResp.fail("商户编号不能为空");
        }

        RelativePositionDto relativePosition = tUserPositionService.getRelativePosition(userId, distance);
        if (null == relativePosition) {
            return BaseResp.fail("商户未找到");
        }

        return BaseResp.success("获取用户位置成功", relativePosition);
    }


    @ApiOperation("获取用户行为记录 -> 张楠")
    @GetMapping("/getActionRecord")
    public BaseResp getActionRecord(@ApiParam("商户编号") @RequestParam("merCode") String merCode,
                                    @RequestParam(name = "pageNum", required = false, defaultValue = "1") int pageNum,
                                    @RequestParam(name = "pageSize", required = false, defaultValue = "4") int pageSize) throws UnsupportedEncodingException {
        if (U.isBlank(merCode)) {
            return BaseResp.fail("商户编号不能为空");
        }

        PageInfo<UserAndActionDto> record = tUserActionService.getActionRecord(merCode, pageNum, pageSize);
        if (null == record) {
            return BaseResp.success("");
        }
        List<UserAndActionDto> list = record.getList();
        System.out.println("UserAndActionDto--nick-->>>" + list.get(0).getContent() + "" + list.get(0).getLatitude());
        List<AiActionRecordVo> aiActionRecordVos = JsonUtil.convertList(list, AiActionRecordVo.class);
        PageInfo pageInfo = JsonUtil.convert(record, AiActionRecordVo.class);
        pageInfo.setList(aiActionRecordVos);
        return BaseResp.success("成功", pageInfo);
    }
}
