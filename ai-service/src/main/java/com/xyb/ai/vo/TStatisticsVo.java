package com.xyb.ai.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@ApiModel(description= "返回响应数据")
public class TStatisticsVo {

    @ApiModelProperty("用户每日PV数")
    private Integer pv;

    @ApiModelProperty("用户每日UV数")
    private Integer uv;

    @ApiModelProperty("统计类型:1-积分换好礼；2-积分当钱花")
    private Short type;

    @ApiModelProperty("统计日期")
    private Date createDate;
}
