package com.google.study.firstDesignModel.singleton;

/**
 * @author created by zc
 * @date 2019/12/4
 * @description 双重校验
 */
public class Singleton3 {
    private volatile static Singleton3 uniqueSingleton;

    private Singleton3() {
    }

    public Singleton3 getInstance() {
        if (null == uniqueSingleton) {
            synchronized (Singleton3.class) {
                if (null == uniqueSingleton) {
                    uniqueSingleton = new Singleton3();
                }
            }
        }
        return uniqueSingleton;
    }
}
