package com.lflytek.design.singleton.type3;

/**
 * @createDate:2021/6/3
 * 懒汉式（线程不安全）
 */
public class SingletonObj {
    private SingletonObj(){}
    private static SingletonObj instance;

    // 线程不安全
    public static SingletonObj getInstance(){
        if(null == instance){
            instance = new SingletonObj();
        }
        return instance;
    }
}
