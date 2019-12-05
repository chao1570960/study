package com.google.study.firstDesignModel.commandMode;

/**
 * @author created by zc
 * @date 2019/12/4
 * @description 请求者角色
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        command.execute();
    }
}
