package com.lflytek.design.factory.simple;

import com.lflytek.design.factory.simple.order.OrderPizza;

/**
 * @createDate:2021/6/4
 */
public class TestDemo {
    public static void main(String[] args) {
        OrderPizza order = new OrderPizza();
        order.order();
    }
}
