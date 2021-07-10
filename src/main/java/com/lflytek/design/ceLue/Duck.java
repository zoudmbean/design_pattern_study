package com.lflytek.design.ceLue;

/**
 * @createDate:2021/7/8
 */
public abstract class Duck {

    public void quak() {
        System.out.println("鸭子嘎嘎叫！");
    }
    public void swiming(){
        System.out.println("鸭子会游泳");
    }
    public void fly(){
        System.out.println("鸭子会飞翔！");
    }

    public abstract void display();

}
