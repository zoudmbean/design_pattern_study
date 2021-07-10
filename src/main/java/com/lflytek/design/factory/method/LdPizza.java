package com.lflytek.design.factory.method;

import com.lflytek.design.factory.method.pizza.LDCheesePizza;
import com.lflytek.design.factory.method.pizza.LDPepperPizza;
import com.lflytek.design.factory.method.pizza.Pizza;

/**
 * @createDate:2021/6/5
 */
public class LdPizza extends PizzaMethodFactory {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        } else {
            throw new RuntimeException("没有" + orderType + "类型的Pizza！");
        }
        return pizza;
    }
}
