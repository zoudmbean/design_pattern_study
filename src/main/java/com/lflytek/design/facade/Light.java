package com.lflytek.design.facade;

/**
 * @createDate:2021/6/22
 * 灯光
 */
public class Light {
    private Light(){}

    // 使用单例模式，饿汉式
    private static Light instance = new Light();

    public static Light getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("Light 打开了");
    }
    public void off(){
        System.out.println("Light 关闭了");
    }

    public void dim(){
        System.out.println("Light 调暗");
    }

    public void bright(){
        System.out.println("Light 调亮");
    }
}
