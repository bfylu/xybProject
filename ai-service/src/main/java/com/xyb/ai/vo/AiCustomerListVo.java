package com.xyb.ai.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
@NoArgsConstructor
@ApiModel(description= "返回响应数据")
public class AiCustomerListVo {

    @ApiModelProperty("用户编号")
    private String userId;

    @ApiModelProperty("用户昵称")
    private String nick;

    @ApiModelProperty("用户头像")
    private String userJmgUrl;

    @ApiModelProperty("用户性别,0-未知；1-男；2-女")
    private Short sex;

    @ApiModelProperty("用户手机")
    private String phone;

    @ApiModelProperty("用户经度")
    private BigDecimal longitude;

    @ApiModelProperty("用户纬度")
    private BigDecimal latitude;

    @ApiModelProperty("距离")
    private String distance;

    @ApiModelProperty("活动时间")
    private String activityDate;

}
