package com.lflytek.design.factory.abs;

import com.lflytek.design.factory.abs.pizza.BJCheesePizza;
import com.lflytek.design.factory.abs.pizza.BJPepperPizza;
import com.lflytek.design.factory.abs.pizza.Pizza;

/**
 * @createDate:2021/6/5
 * 工厂实例
 */
public class BjPizza implements PizzaAbsFactory {

    public Pizza createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
