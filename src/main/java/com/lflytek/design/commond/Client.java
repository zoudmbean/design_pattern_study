package com.lflytek.design.commond;

/**
 * @createDate:2021/6/27
 */
public class Client {
    public static void main(String[] args) {
        // 使用命令设计模式，完成通过遥控器，对电灯的操作

        // 创建电灯的对象（接受者）
        LightReceiver lightReceiver = new LightReceiver();
        // 创建电灯相关的开关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        // 需要一个遥控器
        RemoteController remoteController = new RemoteController();

        // 给遥控器设置相关的命令
        // no = 0 是电灯
        remoteController.setCommands(0,lightOnCommand,lightOffCommand);

        // --------------------
        System.out.println("按下灯的开按钮：");
        remoteController.onButtonWasPushed(0);
        System.out.println("按下灯的关按钮");
        remoteController.offButtonWasPushed(0);
        System.out.println("按下回退按钮");
        remoteController.undoButtonWasPushed();
    }
}
