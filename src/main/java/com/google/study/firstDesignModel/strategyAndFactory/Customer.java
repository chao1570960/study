package com.google.study.firstDesignModel.strategyAndFactory;

/**
 * @author created by zc
 * @date 2019/12/3
 * @description
 */
public class Customer {
    public static void main(String[] args) {
        Context context = new Context();
        System.out.println(context.takeMoney(StrategyEnum.ONE));
        System.out.println(context.takeMoney(StrategyEnum.TEO));
        System.out.println(context.takeMoney(StrategyEnum.THREE));
    }
}
