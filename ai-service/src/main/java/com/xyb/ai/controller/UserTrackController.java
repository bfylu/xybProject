package com.xyb.ai.controller;

import com.xyb.ai.dto.TUserTrackDto;
import com.xyb.ai.model.ai.TUserTrack;
import com.xyb.ai.service.TUserTrackService;
import com.xyb.common.BaseController;
import com.xyb.common.json.BaseResp;
import com.xyb.common.util.JsonUtil;
import com.xyb.common.util.U;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "用户轨迹接口")
@RestController
@RequestMapping(value = "/userTrack")
public class UserTrackController extends BaseController {

    @Autowired
    private TUserTrackService tUserTrackService;

    @PostMapping("/add")
    @ApiOperation("添加用户轨迹接口 -> 李振伟")
    public BaseResp addTUserTrack(TUserTrackDto tUserTrackDto) {
        log.info("=========转换前Latitude" + tUserTrackDto.getLatitude() + "======Longitude=" + tUserTrackDto.getLongitude());
        TUserTrack tUserTrack = JsonUtil.convert(tUserTrackDto, TUserTrack.class);
        /*tUserTrack.setLongitude(tUserTrackDto.getLongitude());
        tUserTrack.setLatitude(tUserTrackDto.getLatitude());*/
        log.info("=========转换后Latitude" + tUserTrack.getLatitude() + "======Longitude=" + tUserTrack.getLongitude());
        boolean ok = tUserTrackService.insertSelective(tUserTrack, null == tUserTrackDto.getCity() ? null : tUserTrackDto.getCity(), null == tUserTrackDto.getArea() ? null : tUserTrackDto.getArea());
        log.info("ok============================================" + ok);
        if (!ok) {
            return BaseResp.fail("addTUserTrack失败");
        }
        return BaseResp.success("addTUserTrack成功");
    }

    @PostMapping("/update")
    @ApiParam("修改用户轨迹 -> 李振伟")
    public BaseResp updateTUserTrack(TUserTrack tUserTrack) {
        TUserTrack tUserTrack1 = tUserTrackService.updateSelective(tUserTrack);
        if (U.isBlank(tUserTrack1)) {
            return BaseResp.fail("修改TUserTrack表失败");
        }
        return BaseResp.success("updateTUserTrack成功");
    }

    @DeleteMapping("/delete")
    @ApiParam("删除用户轨迹 -> 李振伟")
    public BaseResp deleteTUserTrack(@ApiParam("主键Id") @RequestParam Long id) {
        int ok = tUserTrackService.deleteByPrimaryKey(id);
        if (0 == ok) {
            return BaseResp.fail("删除用户轨迹失败");
        }

        return BaseResp.success("删除用户信息成功");
    }
}
