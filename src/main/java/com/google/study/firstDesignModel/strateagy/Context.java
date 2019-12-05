package com.google.study.firstDesignModel.strateagy;

/**
 * @author created by zc
 * @date 2019/12/3
 * @description
 */
public class Context {

    private AbstractStrategy abstractStrategy ;

    public Context(AbstractStrategy abstractStrategy) {
        this.abstractStrategy = abstractStrategy;
    }

    public void contextInterface(){
        abstractStrategy.algorithmLogic();
    }
}
