package com.lflytek.design.ceLue;

/**
 * @createDate:2021/7/8
 * 需要重写父类所有方法
 */
public class WanJuDuck extends Duck{
    @Override
    public void display() {
        System.out.println(" 玩具鸭 ");
    }

    @Override
    public void quak() {
        System.out.println("玩具鸭不会叫");
    }

    @Override
    public void swiming() {
        System.out.println("玩具鸭不会游泳");
    }

    @Override
    public void fly() {
        System.out.println("玩具鸭不会飞");
    }
}
