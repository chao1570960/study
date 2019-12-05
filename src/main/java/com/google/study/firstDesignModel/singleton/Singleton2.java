package com.google.study.firstDesignModel.singleton;

/**
 * @author created by zc
 * @date 2019/12/4
 * @description 饿汉式
 */
public class Singleton2 {
    /**
     * 􏰳􏰳􏰴 优点􏰴：线程安全，延迟初始化:􏱚􏱚􏱛􏱛􏰷􏰷􏰸􏰸􏰹􏰹􏰺􏰺􏰇􏰇􏱅􏱅􏱜􏱜􏱁􏱁􏱂􏱂􏱃􏱃( Effective Java􏱝􏱝􏱞􏱞􏱟􏱟􏰑􏰑)
     *  枚举类型实现的缺点：有部分屌丝看不懂，
     */
    private Singleton2(){}
    public static Singleton2 getInstance () {
        return Holder.SINGLE_TON; }
    private static class Holder{
        private static final Singleton2 SINGLE_TON = new Singleton2();
    }
}
