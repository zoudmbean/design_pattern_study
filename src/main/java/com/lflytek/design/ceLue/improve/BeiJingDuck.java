package com.lflytek.design.ceLue.improve;


import com.lflytek.design.ceLue.improve.celue.Fly;
import com.lflytek.design.ceLue.improve.celue.impl.BadFly;

/**
 * @createDate:2021/7/8
 */
public class BeiJingDuck extends Duck {

    // 在父类Duck中定义了fly变量，子类可以直接使用父类的非私有的属性
    public BeiJingDuck(){
        fly = new BadFly();
    }

    @Override
    public void display() {
        System.out.println(" 北京鸭 ");
    }
}
