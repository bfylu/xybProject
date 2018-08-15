package com.xyb.ai.controller;

import com.xyb.ai.model.ai.TStatistics;
import com.xyb.ai.service.TStatisticsService;
import com.xyb.ai.vo.TStatisticsVo;
import com.xyb.common.PageInfo;
import com.xyb.common.json.BaseResp;
import com.xyb.common.util.JsonUtil;
import com.xyb.common.util.U;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "统计PV+UV接口")
@RestController
@RequestMapping(value = "/payStatistics")
public class StatisticsController {

    @Autowired
    private TStatisticsService tStatisticsService;

    @GetMapping("/getStatisticsByPage")
    @ApiOperation("分页PV+UV信息 -> 李振伟")
    public BaseResp<PageInfo<TStatisticsVo>> getStatisticsByPage(
            @ApiParam(name = "pageNum", value = "当前页") @RequestParam(name = "pageNum", required = false, defaultValue = "1") int pageNum,
            @ApiParam(name = "pageSize", value = "每页条数") @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize) {
        PageInfo<TStatistics> pageInfo = tStatisticsService.findByPage(pageNum, pageSize);

        //取出需要转换的页内容
        List<TStatistics> listTStatistics = pageInfo.getList();

        //屏蔽一些字段，只显示TuserVo中的字段
        List<TStatisticsVo> listTStatisticsVo = JsonUtil.convertList(listTStatistics, TStatisticsVo.class);

        //把原来的分页数据拷贝过来，如：当前页,每页的数量,总记录数,总页数,是否为第一页,是否为最后一页
        PageInfo<TStatisticsVo> pageInfoVo = JsonUtil.convert(pageInfo, TStatisticsVo.class);
        //放入转换后的内容
        pageInfoVo.setList(listTStatisticsVo);
        return BaseResp.success("PV+UV分页信息成功", pageInfoVo);
    }

    @PostMapping("/add")
    @ApiOperation("统计PV+UV接口")
    public BaseResp addPayStatistics(
            @ApiParam(name = "unionid", value = "用户unionid", required = true) @RequestParam("unionid") String unionid,
            @ApiParam(name = "statisticsType", value = "统计类型：1-积分换好礼；2-积分当钱花", required = true) @RequestParam("statisticsType") short statisticsType) {
        if (U.isBlank(unionid) || U.isBlank(statisticsType)) {
            return BaseResp.fail("参数不能为空");
        }
        boolean ok = tStatisticsService.insertSelective(unionid, statisticsType);
        if (!ok) {
            return BaseResp.fail("添加统计记录失败");
        } else {
            return BaseResp.success("添加统计记录成功");
        }
    }

}
