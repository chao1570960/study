package com.google.study.firstDesignModel.factoryModel.factoryMethodModel;

import com.google.study.firstDesignModel.factoryModel.simpleFactory.BMW;
import com.google.study.firstDesignModel.factoryModel.simpleFactory.BMW111;

/**
 * @author created by zc
 * @date 2019/12/3
 * @description this is actually factory role
 */
public class FactoryBWM111 implements FactoryMapper {
    @Override
    public BMW111 createBMW() {
        return new BMW111();
    }
}
