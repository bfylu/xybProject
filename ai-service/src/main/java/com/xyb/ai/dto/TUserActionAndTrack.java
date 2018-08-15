package com.xyb.ai.dto;

import com.xyb.ai.model.ai.TUserAction;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
@NoArgsConstructor
public class TUserActionAndTrack extends TUserAction {

    private String userJmgUrl;

    private String nick;

    private Short sex;

    private String curAddress;

    private String pcaCode;

    private BigDecimal longitude;

    private BigDecimal latitude;

    private Short status;

    private BigDecimal merLongitude;

    private BigDecimal merLatitude;

    private String distance;

}
