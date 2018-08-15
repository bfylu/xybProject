package com.xyb.ai.constant;

/**
 * 监控枚举类
 */
public enum  StatisticsType {

    PAY(1);

    private int value;

    private StatisticsType(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
