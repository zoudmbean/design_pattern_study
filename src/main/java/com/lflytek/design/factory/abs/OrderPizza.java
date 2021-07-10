package com.lflytek.design.factory.abs;

import com.lflytek.design.factory.abs.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @createDate:2021/6/5
 */
public class OrderPizza {
    private PizzaAbsFactory factory;
    // 通过构造器将具体的工厂对象传递进来
    public OrderPizza(PizzaAbsFactory factory){
        this.setPizzaAbsFactory(factory);
    }

    private void setPizzaAbsFactory(PizzaAbsFactory factory){
        Pizza pizza = null;
        this.factory = factory;

        do {
            // factory 可能是北京的工厂子类，也可能是伦敦的工厂子类
            pizza = factory.createPizza(getType());
            if (pizza != null) { // 订购ok
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败");
                break;
            }
        } while (true);
    }

    // 写一个方法，可以获取客户希望订购的披萨种类
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
