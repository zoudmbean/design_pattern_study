package com.lflytek.design.ceLue.improve;

import com.lflytek.design.ceLue.improve.celue.Fly;
import lombok.Data;

/**
 * @createDate:2021/7/9
 */
@Data
public abstract class Duck {

    // 属性  策略接口
    protected Fly fly;

    public void quak() {
        System.out.println("鸭子嘎嘎叫！");
    }
    public void swiming(){
        System.out.println("鸭子会游泳");
    }
    public void fly(){
        if(fly != null){
            fly.fly();
        }
    }

    public abstract void display();

}
