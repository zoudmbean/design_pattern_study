package com.lflytek.design.singleton;

import com.lflytek.design.singleton.type1.SingletonObj;
import com.lflytek.design.singleton.type7.SingletonEnum;

/**
 * @createDate:2021/6/3
 * 单例模式方式一
 */
public class SingletonDemo {
    public static void main(String[] args) {
        // type1();
        SingletonEnum instance1 = SingletonEnum.INSTANCE;
        SingletonEnum instance2 = SingletonEnum.INSTANCE;
        System.out.println(instance1 == instance2);
    }

    private static void type1() {
        SingletonObj instance1 = SingletonObj.getInstance();
        SingletonObj instance2 = SingletonObj.getInstance();
        System.out.println(instance1 == instance2);
    }
}
