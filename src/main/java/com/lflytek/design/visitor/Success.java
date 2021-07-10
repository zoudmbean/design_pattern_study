package com.lflytek.design.visitor;

/**
 * @createDate:2021/6/29
 */
public class Success extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("man 给的评价是很成功！");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("woman 给的评价是很成功！");
    }
}
