package com.google.study.firstDesignModel.singleton;

/**
 * @author created by zc
 * @date 2019/12/4
 * @description 懒汉式
 */
public class Singleton1 {
    /**
     * 􏰳􏰳􏰴􏰴􏰵􏰵􏰶􏰶􏰃􏰃􏰷􏰷􏰸􏰸􏰹􏰹􏰺􏰺􏰻􏰻􏰼􏰼􏰇􏰇􏰽􏰽􏰾􏰾优点：没有现成安全问题，简单
     * 缺点：提前初始化会延长类加载器加载类的时间，如果不适用会浪费空间
     */
    private static final Singleton1 instance = new Singleton1();
    private Singleton1(){};
    public static Singleton1 getInstance(){
        return instance; }
}
