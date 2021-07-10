package com.lflytek.design.visitor;

/**
 * @createDate:2021/6/29
 */
public class Man extends Person {
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
