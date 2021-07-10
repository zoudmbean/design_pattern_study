package com.lflytek.design.ceLue;

/**
 * @createDate:2021/7/8
 */
public class BeiJingDuck extends Duck {
    @Override
    public void display() {
        System.out.println(" 北京鸭 ");
    }

    @Override
    public void fly() {
        System.out.println("北京鸭不会飞");
    }
}
