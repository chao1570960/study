package com.google.study.firstDesignModel.proxyModel.jdkDynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.google.study.firstDesignModel.proxyModel.staticProxy.AbstractRole;

/**
 * @author created by zc
 * @date 2019/12/4
 * @description
 */
public class DynamicProxyRole implements InvocationHandler {

    private Object object;

    public DynamicProxyRole(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理前");
        Object result = method.invoke(object,args);
        System.out.println("代理后");
        return result;
    }
}
