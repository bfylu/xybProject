package com.xyb.ai.dto;

import io.swagger.annotations.ApiParam;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class TUserDto {
    @ApiParam("用户名称")
    private String userName;

    @ApiParam("用户密码")
    private String password;

    @ApiParam("用户电话")
    private String phone;
}
