package com.lflytek.design.factory.method;

import com.lflytek.design.factory.method.pizza.BJCheesePizza;
import com.lflytek.design.factory.method.pizza.BJPepperPizza;
import com.lflytek.design.factory.method.pizza.Pizza;

/**
 * @createDate:2021/6/5
 */
public class BjPizza extends PizzaMethodFactory {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        } else {
            throw new RuntimeException("没有" + orderType + "类型的Pizza！");
        }
        return pizza;
    }
}
