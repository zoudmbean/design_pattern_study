package com.lflytek.design.facade;

/**
 * @createDate:2021/6/22
 * 投影仪
 */
public class Projector {
    private Projector(){}

    // 使用单例模式，饿汉式
    private static Projector instance = new Projector();

    public static Projector getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("Projector 打开了");
    }
    public void off(){
        System.out.println("Projector 关闭了");
    }

    public void play(){
        System.out.println("Projector 正在工作");
    }

    public void focus(){
        System.out.println("Projector 聚焦");
    }
}
