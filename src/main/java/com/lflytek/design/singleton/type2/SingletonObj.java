package com.lflytek.design.singleton.type2;

/**
 * @createDate:2021/6/3
 * 饿汉式（静态代码块方式）
 * 该方式的优缺点：
 *      1）优点：线程安全、简单
 *      2）缺点：不是懒加载的，可能会造成内存浪费
 */
public class SingletonObj {

    // 1. 私有化构造器
    private SingletonObj(){}

    // 2. 本类内部定义实例化对象
    private static SingletonObj instance ;
    // 2.1 在静态代码块中创建单例对象
    static {
        instance = new SingletonObj();
    }

    // 3. 提供外部接口获取实例
    public static SingletonObj getInstance() {
        return instance;
    }

}
