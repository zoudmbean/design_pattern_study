package com.lflytek.design.decorator.decorator;

import com.lflytek.design.decorator.component.Drink;

/**
 * @createDate:2021/6/20
 * 装饰者类
 */
public class Decorator extends Drink {

    // 组合被装饰的Drink
    private Drink drink;
    public Decorator(Drink drink){
        this.drink = drink;
    }

    @Override
    public float coast() {
        // 价格 = 自己的price + drink的coat
        return super.getPrice() + drink.coast();
    }

    @Override
    public String getDes() {
        // 输出被装饰者的信息  drink.getDes()
        return super.getDes() + "  " + super.getPrice() + " && " + drink.getDes();
    }
}
