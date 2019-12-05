package com.google.study.firstDesignModel.factoryModel.factoryMethodModel;

import com.google.study.firstDesignModel.factoryModel.simpleFactory.BMW111;
import com.google.study.firstDesignModel.factoryModel.simpleFactory.BMW222;

/**
 * @author created by zc
 * @date 2019/12/3
 * @description
 */
public class Customer {
    public static void main(String[] args) {
        FactoryBWM111 factoryBWM111 = new FactoryBWM111();
        BMW111 bmw111 = factoryBWM111.createBMW();

        FactoryBWM222 factoryBWM222 = new FactoryBWM222();
        BMW222 bmw222 = new BMW222();
    }
}
