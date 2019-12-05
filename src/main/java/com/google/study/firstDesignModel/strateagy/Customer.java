package com.google.study.firstDesignModel.strateagy;

/**
 * @author created by zc
 * @date 2019/12/3
 * @description
 */
public class Customer {
    public static void main(String[] args) {
        StrategyA strategyA = new StrategyA();
        Context context = new Context(strategyA);
        context.contextInterface();
    }
}
