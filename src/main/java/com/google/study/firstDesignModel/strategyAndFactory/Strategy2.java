package com.google.study.firstDesignModel.strategyAndFactory;

/**
 * @author created by zc
 * @date 2019/12/3
 * @description
 */
public class Strategy2 implements StrategyInterface {
    @Override
    public Double takeMoney(StrategyEnum strategyEnum) {
        return Double.valueOf(strategyEnum.getName());
    }
}
