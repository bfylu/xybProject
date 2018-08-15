package com.xyb.ai.controller;

import com.xyb.ai.dto.TPcaDto;
import com.xyb.ai.model.ai.TPca;
import com.xyb.ai.service.TPcaService;
import com.xyb.ai.vo.TPcaVo;
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

@Api(tags = "PCA地址接口")
@RestController
@RequestMapping(value = "/pca")
public class PcaController extends BaseController {

    @Autowired
    private TPcaService tPcaService;

    @PostMapping("/add")
    @ApiOperation("添加PCA记录 -> 陈旭东")
    public BaseResp addTPca(TPcaDto tPcaDto) {
        //转换成需要显示的类型
        TPca tPca = JsonUtil.convert(tPcaDto, TPca.class);
        TPca ok = tPcaService.insertSelective(tPca);

        if (U.isBlank(ok)) {
            return BaseResp.fail("add地址信息失败");
        }

        log.info("Return PcaCode:" + ok.getPcaCode());
        return BaseResp.success("添加地址记录成功");
    }

    @DeleteMapping("/delete")
    @ApiOperation("删除地址记录 -> 陈旭东")
    public BaseResp delTPca(@ApiParam("pcaCode") @RequestParam String pcaCode) {
        int ok = tPcaService.deleteByPrimaryKey(pcaCode);
        if (ok == 0) {
            return BaseResp.fail("删除地址信息失败");
        }

        return BaseResp.success("删除地址信息成功");
    }

    @PostMapping("/update")
    @ApiOperation("修改地址记录 -> 陈旭东")
    public BaseResp updateTPca(TPca tPca) {
        TPca TPca1 = tPcaService.updateByPrimaryKey(tPca);
        if (U.isBlank(TPca1)) {
            return BaseResp.fail("修改地址信息失败");
        }
        return BaseResp.success("修改地址信息成功");
    }

    @GetMapping("/select")
    @ApiOperation("获取地址信息 -> 陈旭东")
    public BaseResp<TPcaVo> selecTPca(@ApiParam("pcaCode") @RequestParam String pcaCode) {
        TPca tPca = tPcaService.selectByPrimaryKey(pcaCode);
        if (U.isBlank(tPca)) {
            return BaseResp.fail("无地址数据");
        }

        //转换成需要显示的类型
        TPcaVo tPcaVo = JsonUtil.convert(tPca, TPcaVo.class);

        return BaseResp.success("获取地址信息成功", tPcaVo);
    }

    @GetMapping("/findByCondition")
    @ApiOperation("根据条件查找地址信息 -> 陈旭东")
    public BaseResp<PageInfo<TPca>> findByCondition(TPca tPca,
                                                    @RequestParam(name = "pageNum", required = false, defaultValue = "1") int pageNum,
                                                    @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize) {
        PageInfo<TPca> pageInfoTPca = tPcaService.findByCondition(tPca, pageNum, pageSize);
        if (U.isBlank(pageInfoTPca)) {
            return BaseResp.fail("无地址数据");
        }

        return BaseResp.success("根据条件查找地址信息成功", pageInfoTPca);
    }
}
