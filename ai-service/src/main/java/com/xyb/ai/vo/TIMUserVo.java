package com.xyb.ai.vo;

import com.xyb.ai.model.ai.TImUser;
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
public class TIMUserVo {
    @ApiModelProperty("用户id")
    private String userId;
    
    @ApiModelProperty("用户昵称")
    private String nick;

    @ApiModelProperty("图像地址")
    private String userJmgUrl;

    //转换数据
    public static List<TIMUserVo> assemblyData(List<TImUser> TImUserGroups) {
        return JsonUtil.convertList(TImUserGroups, TIMUserVo.class);
    }
}
