package com.lflytek.design.facade;

/**
 * @createDate:2021/6/22
 * 爆米花机
 */
public class PopCorm {
    private PopCorm(){}

    // 使用单例模式，饿汉式
    private static PopCorm instance = new PopCorm();

    public static PopCorm getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("PopCorm 打开了");
    }
    public void off(){
        System.out.println("PopCorm 关闭了");
    }

    public void pop(){
        System.out.println("PopCorm 正在工作");
    }

    public void pause(){
        System.out.println("PopCorm 暂停工作");
    }
}
