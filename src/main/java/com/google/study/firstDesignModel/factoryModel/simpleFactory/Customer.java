package com.google.study.firstDesignModel.factoryModel.simpleFactory;

/**
 * @author created by zc
 * @date 2019/12/3
 * @description
 */
public class Customer {

    public static void main(String[] args) {
        Factory factory = new Factory();
        factory.createBMW(111);
        factory.createBMW(222);
    }
}
