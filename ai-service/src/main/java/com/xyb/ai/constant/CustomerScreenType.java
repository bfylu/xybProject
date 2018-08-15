package com.xyb.ai.constant;

public enum CustomerScreenType {

    ACTIVITY_TIME(1,"最后活动时间"),FORWARD(2,"转发"),SCAN_PAYMENT(3,"扫码支付"),SHOP_LATELY(4,"到店最近");

    private int value;
    private String desc;

    CustomerScreenType(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
