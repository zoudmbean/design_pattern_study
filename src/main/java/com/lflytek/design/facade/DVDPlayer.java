package com.lflytek.design.facade;

/**
 * @createDate:2021/6/22
 */
public class DVDPlayer {

    private DVDPlayer(){}

    // 使用单例模式，饿汉式
    private static DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("DVD 打开了");
    }
    public void off(){
        System.out.println("DVD 关闭了");
    }

    public void play(){
        System.out.println("DVD 正在播放");
    }

    public void pause(){
        System.out.println("DVD 暂停播放");
    }
}
