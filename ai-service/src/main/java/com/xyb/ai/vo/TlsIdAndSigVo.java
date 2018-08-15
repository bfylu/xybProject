package com.xyb.ai.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@ApiModel(description= "返回响应数据")
public class TlsIdAndSigVo {
    @ApiModelProperty("identifier")
    private String identifier;

    @ApiModelProperty("用户签名")
    private String usersig;
}
