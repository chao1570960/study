package com.google.study.firstDesignModel.strategyAndFactory;


/**
 * @author created by zc
 * @date 2019/12/3
 * @description
 */
public class Context {

    private StrategyInterface strategyInterface;

    public Double takeMoney(StrategyEnum strategyEnum){
        StrategyInterface strategyInterface = StrategyFactory.getInstance().creteStrategy(strategyEnum.getName());
        return strategyInterface.takeMoney(strategyEnum);
    }

    public StrategyInterface getStrategyInterface() {
        return strategyInterface;
    }

    public void setStrategyInterface(StrategyInterface strategyInterface) {
        this.strategyInterface = strategyInterface;
    }
}
