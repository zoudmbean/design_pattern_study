package com.lflytek.design.bridge.i.impl;

import com.lflytek.design.bridge.i.IBrand;

/**
 * @createDate:2021/6/19
 */
public class XiaoMi implements IBrand {
    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }

    @Override
    public void open() {
        System.out.println("小米手机开机");
    }

    @Override
    public void close() {
        System.out.println("小米手机关机");
    }
}
