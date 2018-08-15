package com.xyb.ai.dto;

import com.xyb.ai.model.ai.TMerchant;
import io.swagger.annotations.ApiParam;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class RelativePositionDto{

    @ApiParam("商家信息")
    private TMerchant tMerchant;

    @ApiParam("周边用户信息")
    private List<TUserPositionDto> list;

}
