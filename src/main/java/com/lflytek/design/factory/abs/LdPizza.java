package com.lflytek.design.factory.abs;

import com.lflytek.design.factory.abs.pizza.LDCheesePizza;
import com.lflytek.design.factory.abs.pizza.LDPepperPizza;
import com.lflytek.design.factory.abs.pizza.Pizza;

/**
 * @createDate:2021/6/5
 * 工厂实例
 */
public class LdPizza implements PizzaAbsFactory {

    public Pizza createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
