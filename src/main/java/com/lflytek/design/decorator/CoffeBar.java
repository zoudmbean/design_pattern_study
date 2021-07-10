package com.lflytek.design.decorator;

import com.lflytek.design.decorator.component.ConcreteComponent.LongBlack;
import com.lflytek.design.decorator.component.Drink;
import com.lflytek.design.decorator.decorator.ext.Chocalate;
import com.lflytek.design.decorator.decorator.ext.Milk;

/**
 * @createDate:2021/6/20
 * 装饰者模式下的订单：2份巧克力+一份牛奶的LongBlack
 */
public class CoffeBar {
    public static void main(String[] args) {
        // 1. 点一份LongBlack
        Drink order = new LongBlack();
        float coast = order.coast();
        String des = order.getDes();
        System.out.println("费用1：" + coast + "  描述1：" + des);

        // 2. 加入一份牛奶
        order = new Milk(order);
        float milkCoast = order.coast();
        String milkDes = order.getDes();
        System.out.println("order加入一份牛奶 费用：" + milkCoast + "  描述：" + milkDes);

        // 3. 加入一份巧克力
        order = new Chocalate(order);
        float chocalateCoast = order.coast();
        String chocalateDesc = order.getDes();
        System.out.println("order加入一份牛奶 + 加入一份巧克力 费用：" + chocalateCoast + "  描述：" + chocalateDesc);

    }
}
