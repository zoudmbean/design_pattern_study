package com.lflytek.design.singleton.type4;

/**
 * @createDate:2021/6/3
 * 懒汉式（线程安全  同步方法）
 */
public class SingletonObj {
    private SingletonObj(){}
    private static SingletonObj instance;

    // 同步方法
    public static synchronized SingletonObj getInstance(){
        if(null == instance){
            instance = new SingletonObj();
        }
        return instance;
    }
}
