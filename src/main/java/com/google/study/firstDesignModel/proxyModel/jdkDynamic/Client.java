package com.google.study.firstDesignModel.proxyModel.jdkDynamic;

import java.lang.reflect.Proxy;

/**
 * @author created by zc
 * @date 2019/12/4
 * @description
 */
public class Client {
    public static void main(String[] args) {
        AbstractRole realRole = new RealRole();
        DynamicProxyRole proxyRole = new DynamicProxyRole(realRole);
        ClassLoader classLoader = realRole.getClass().getClassLoader();
        AbstractRole abstractRole = (AbstractRole) Proxy.newProxyInstance(classLoader,new Class[]{AbstractRole.class},proxyRole);
        abstractRole.newRole();
    }
}
