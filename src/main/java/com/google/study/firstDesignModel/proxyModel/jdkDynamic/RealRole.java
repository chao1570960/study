package com.google.study.firstDesignModel.proxyModel.jdkDynamic;


/**
 * @author created by zc
 * @date 2019/12/4
 * @description 真实角色
 */
public class RealRole implements AbstractRole {
    @Override
    public void newRole() {
        System.out.println("this is a real role");
    }
}
