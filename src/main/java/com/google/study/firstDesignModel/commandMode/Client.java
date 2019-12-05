package com.google.study.firstDesignModel.commandMode;

import com.sun.org.apache.regexp.internal.RE;

/**
 * @author created by zc
 * @date 2019/12/4
 * @description 客户端角色
 */
public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreateCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}
