package com.lflytek.design.bridge.i.impl;

import com.lflytek.design.bridge.i.IBrand;

/**
 * @createDate:2021/6/19
 */
public class Vivo implements IBrand {
    @Override
    public void call() {
        System.out.println("VIVO手机打电话");
    }

    @Override
    public void open() {
        System.out.println("VIVO手机开机");
    }

    @Override
    public void close() {
        System.out.println("VIVO手机关机");
    }
}
