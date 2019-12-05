package com.google.study.firstDesignModel.proxyModel.cglib;

import org.springframework.cglib.proxy.Enhancer;

/**
 * @author created by zc
 * @date 2019/12/4
 * @description
 */
public class Client {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(HelloConcrete.class);
        enhancer.setCallback(new MyMethodInterceptor());

        HelloConcrete helloConcrete = (HelloConcrete)enhancer.create();
        System.out.println(helloConcrete.sayHello("hello java"));

    }
}
