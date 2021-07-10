package com.lflytek.design.singleton.type5;

/**
 * @createDate:2021/6/3
 * 懒汉式（同步代码块，双端检索机制 + volatile）
 */
public class SingletonObj {
    private SingletonObj(){}
    private static volatile SingletonObj instance;

    // 同步方法
    public static SingletonObj getInstance(){
        if(null == instance){
            synchronized (SingletonObj.class){
                if(null == instance){
                    instance = new SingletonObj();
                }
            }
        }
        return instance;
    }
}
