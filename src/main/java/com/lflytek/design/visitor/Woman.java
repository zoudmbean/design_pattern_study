package com.lflytek.design.visitor;

/**
 * @createDate:2021/6/29
 * 这里使用到了双分派，即首先在客户端程序中将具体的状态作为参数传递给woman中（第一次分派）
 * 然后woman类调用作为参数的“具体方法”中的getWomanResult方法，同时将自己（this）作为参数传入，完成第二次分派
 */
public class Woman extends Person {
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
