package com.google.study.firstDesignModel.commandMode;

/**
 * @author created by zc
 * @date 2019/12/4
 * @description
 */
public class ConcreateCommand implements Command {

    private Receiver receiver ;

    public ConcreateCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
