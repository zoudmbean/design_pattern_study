package com.lflytek.design.factory.abs;


import com.lflytek.design.factory.abs.pizza.Pizza;

/**
 * 抽象工厂
 */
public interface PizzaAbsFactory {
    Pizza createPizza(String orderType);
}
