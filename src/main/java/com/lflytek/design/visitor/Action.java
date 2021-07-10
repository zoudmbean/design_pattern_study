package com.lflytek.design.visitor;

/**
 * @createDate:2021/6/29
 */
public abstract class Action {
    // 得到男性测评
    public abstract void getManResult(Man man);

    // 得到女性的测评
    public abstract void getWomanResult(Woman woman);
}
