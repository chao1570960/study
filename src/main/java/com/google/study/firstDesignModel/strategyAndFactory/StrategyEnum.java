package com.google.study.firstDesignModel.strategyAndFactory;

import lombok.Data;

/**
 * @author created by zc
 * @date 2019/12/3
 * @description
 */

public enum StrategyEnum {

    ONE("1"),TEO("2"),THREE("3");

    public String getName() {
        return name;
    }

    private String name;

    StrategyEnum(String name) {
        this.name = name;
    }
}
