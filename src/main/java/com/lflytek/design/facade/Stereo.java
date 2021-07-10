package com.lflytek.design.facade;

/**
 * @createDate:2021/6/22
 * 立体声
 */
public class Stereo {
    private Stereo(){}

    // 使用单例模式，饿汉式
    private static Stereo instance = new Stereo();

    public static Stereo getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("Stereo 打开了");
    }
    public void off(){
        System.out.println("Stereo 关闭了");
    }

    public void up(){
        System.out.println("Stereo 增加");
    }

}
