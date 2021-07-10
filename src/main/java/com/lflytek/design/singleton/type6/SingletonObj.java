package com.lflytek.design.singleton.type6;

/**
 * @createDate:2021/6/4
 * 单例设计：静态内部类
 * 静态内部类的特点：
 *  1）在在不类装载的时候，静态内部类是不会加载的
 *  2）在调用静态内部类的时候，才会装载
 *  3）在装载的时候，是线程安全的。
 *  因此，静态内部类的单例设计，是线程安全的懒加载模式
 */
public class SingletonObj {
    // 1. 私有化构造器
    private SingletonObj(){}
    // 2. 定义静态内部类
    private static class SingletonInstance{
        private static final SingletonObj INSTANCE = new SingletonObj();
    }
    // 3. 提供访问接口
    public static SingletonObj getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
