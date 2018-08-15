package com.xyb.ai.dto;

import com.xyb.ai.model.ai.TUserTrack;
import io.swagger.annotations.ApiParam;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class FieldExtendsTrack extends TUserTrack {

    @ApiParam("商品引用号")
    private String refNo;

    @ApiParam("用户行为状态:0-浏览;1-未支付;2-支付成功;3-取消订单")
    private int actionState;

    @ApiParam("商品名称")
    private String goodsName;

    @ApiParam("距离")
    private String distance;

    @ApiParam("内容")
    private String content;

    @ApiParam("活动时间")
    private String activityDate;

}
