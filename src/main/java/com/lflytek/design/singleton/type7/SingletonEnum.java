package com.lflytek.design.singleton.type7;

/**
 * @createDate:2021/6/4
 * 枚举方式实现单例
 * 优点：
 *      1）线程安全
 *      2）防止反序列化重新创建对象
 */
public enum SingletonEnum {
    INSTANCE;
}
