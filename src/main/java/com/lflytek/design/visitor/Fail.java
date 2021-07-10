package com.lflytek.design.visitor;

/**
 * @createDate:2021/6/29
 */
public class Fail extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("man 的评价是失败");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("woman 的评价是失败");
    }
}
