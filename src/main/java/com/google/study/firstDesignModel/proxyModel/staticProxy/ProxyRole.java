package com.google.study.firstDesignModel.proxyModel.staticProxy;

/**
 * @author created by zc
 * @date 2019/12/4
 * @description 代理角色
 */
public class ProxyRole extends AbstractRole {

    private RealRole realRole;

    @Override
    public void newRole() {

        before();
        if (this.realRole == null)
            this.realRole = new RealRole();
        this.realRole.newRole();

        after();
    }

    public void before(){
        System.out.println("开始代理");
    }
    public void after(){
        System.out.println("代理结束");
    }
}
