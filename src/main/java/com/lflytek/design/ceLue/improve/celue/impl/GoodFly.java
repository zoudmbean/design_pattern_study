package com.lflytek.design.ceLue.improve.celue.impl;

import com.lflytek.design.ceLue.improve.celue.Fly;

/**
 * @createDate:2021/7/9
 * 很会飞策略
 */
public class GoodFly implements Fly {
    @Override
    public void fly() {
        System.out.println(" 很会飞 ");
    }
}
