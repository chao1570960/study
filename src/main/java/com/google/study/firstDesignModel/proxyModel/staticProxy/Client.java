package com.google.study.firstDesignModel.proxyModel.staticProxy;

/**
 * @author created by zc
 * @date 2019/12/4
 * @description
 */
public class Client {

    public static void main(String[] args) {
        AbstractRole abstractRole = new ProxyRole();
        abstractRole.newRole();
    }
}
