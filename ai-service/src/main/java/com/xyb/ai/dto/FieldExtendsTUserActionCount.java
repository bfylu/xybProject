package com.xyb.ai.dto;

import com.xyb.ai.model.ai.TUserActionCount;
import io.swagger.annotations.ApiParam;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class FieldExtendsTUserActionCount extends TUserActionCount {

    @ApiParam("日期")
    private String date;

    @ApiParam("内容")
    private String content;

    @ApiParam("头像")
    private String userJmgUrl;
}
