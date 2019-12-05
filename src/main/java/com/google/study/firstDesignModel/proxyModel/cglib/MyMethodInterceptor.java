package com.google.study.firstDesignModel.proxyModel.cglib;


import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * @author created by zc
 * @date 2019/12/4
 * @description cglib动态代理
 */
public class MyMethodInterceptor implements MethodInterceptor {


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("代理前");
        return methodProxy.invokeSuper(o,objects);
    }
}
