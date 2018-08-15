package com.xyb.shop.dto;

import com.xyb.shop.model.xyb.Goods;
import io.swagger.annotations.ApiParam;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class GoodsDto extends Goods {

    @ApiParam("商品销量")
    private Integer goodsSales;

    @ApiParam("排序规则")
    private boolean sortRule;

}
