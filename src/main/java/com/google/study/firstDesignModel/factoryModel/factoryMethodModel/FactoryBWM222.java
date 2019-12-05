package com.google.study.firstDesignModel.factoryModel.factoryMethodModel;

import com.google.study.firstDesignModel.factoryModel.simpleFactory.BMW;
import com.google.study.firstDesignModel.factoryModel.simpleFactory.BMW222;

/**
 * @author created by zc
 * @date 2019/12/3
 * @description
 */
public class FactoryBWM222 implements FactoryMapper {
    @Override
    public BMW222 createBMW() {
        return new BMW222();
    }
}
