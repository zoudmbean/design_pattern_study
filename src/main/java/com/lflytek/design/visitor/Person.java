package com.lflytek.design.visitor;

/**
 * @createDate:2021/6/29
 */
public abstract class Person {
    // 提供一个方法让访问者可以访问
    public abstract void accept(Action action);
}
