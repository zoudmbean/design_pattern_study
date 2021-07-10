package com.lflytek.design.ceLue.improve.celue.impl;

import com.lflytek.design.ceLue.improve.celue.Fly;

/**
 * @createDate:2021/7/9
 */
public class BadFly implements Fly {
    @Override
    public void fly() {
        System.out.println(" 不大会飞 ");
    }
}
