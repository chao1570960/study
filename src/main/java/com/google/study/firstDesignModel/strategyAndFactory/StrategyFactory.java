package com.google.study.firstDesignModel.strategyAndFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author created by zc
 * @date 2019/12/3
 * @description
 */
public class StrategyFactory {

    private static StrategyFactory strategyFactory = new StrategyFactory();

    private StrategyFactory() {
    }

    private static Map<String,StrategyInterface> strategyEnumMap = new HashMap<>();

    static {
        strategyEnumMap.put(StrategyEnum.ONE.getName(),new Strategy1());
        strategyEnumMap.put(StrategyEnum.TEO.getName(),new Strategy2());
        strategyEnumMap.put(StrategyEnum.THREE.getName(),new Strategy3());
    }

    public StrategyInterface creteStrategy(String a){
        return this.strategyEnumMap.get(a);
    }

    public static StrategyFactory getInstance(){
        return strategyFactory;
    }
}
