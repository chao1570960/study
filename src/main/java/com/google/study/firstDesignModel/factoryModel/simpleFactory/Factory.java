package com.google.study.firstDesignModel.factoryModel.simpleFactory;

/**
 * @author created by zc
 * @date 2019/12/3
 * @description
 */
public class Factory {

    public BMW createBMW(int code){
        switch (code){
            case 111:
                return new BMW111();
            case 222:
                return new BMW222();
            default:
                break;
        }

        return null;
    }

}
