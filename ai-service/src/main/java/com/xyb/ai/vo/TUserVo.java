package com.xyb.ai.vo;

import com.xyb.ai.model.ai.TUser;
import com.xyb.common.util.JsonUtil;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@ApiModel(description= "返回响应数据")
public class TUserVo {
    @ApiModelProperty("用户名称")
    private String userName;

    @ApiModelProperty("用户密码")
    private String password;

    @ApiModelProperty("用户电话")
    private String phone;

//    @ApiModelProperty("xxx")
//    private String xxx;


    //转换数据
    public static List<TUserVo> assemblyData(List<TUser> tUserGroups) {
        return JsonUtil.convertList(tUserGroups, TUserVo.class);
    }
}
