package com.lflytek.design.ceLue.improve;

import com.lflytek.design.ceLue.improve.celue.Fly;
import com.lflytek.design.ceLue.improve.celue.impl.NoneFly;

/**
 * @createDate:2021/7/8
 * 需要重写父类所有方法
 */
public class WanJuDuck extends Duck{

    // 构造器，传入具体的策略对象
    public WanJuDuck(){
        fly = new NoneFly();
    }

    @Override
    public void display() {
        System.out.println(" 玩具鸭 ");
    }

}
