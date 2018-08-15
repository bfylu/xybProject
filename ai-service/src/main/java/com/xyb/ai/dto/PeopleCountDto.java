package com.xyb.ai.dto;

import io.swagger.annotations.ApiParam;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class PeopleCountDto {

    @ApiParam("潜在客户")
    private Long peopleCount;

    @ApiParam("在线人数")
    private Long onLinePeopleCount;
}
