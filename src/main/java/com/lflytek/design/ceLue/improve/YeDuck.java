package com.lflytek.design.ceLue.improve;

import com.lflytek.design.ceLue.improve.celue.Fly;
import com.lflytek.design.ceLue.improve.celue.impl.GoodFly;

/**
 * @createDate:2021/7/8
 */
public class YeDuck extends Duck {

    // 构造器，传入具体的策略对象
    public YeDuck(){
        fly = new GoodFly();
    }
    @Override
    public void display() {
        System.out.println("野鸭");
    }
}
