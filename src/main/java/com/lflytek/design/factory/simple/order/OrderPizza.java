package com.lflytek.design.factory.simple.order;

import com.lflytek.design.factory.simple.PiSaSimpleFactory;
import com.lflytek.design.factory.simple.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @createDate:2021/6/4
 */
public class OrderPizza {
    Pizza pizza = null;
    public void order(){
        String orderType = ""; //用户输入的
        do {
            orderType = getType();
            // 使用披萨工厂创建披萨
            pizza = PiSaSimpleFactory.makePizza(orderType);
            //输出pizza
            if(pizza != null) { //订购成功
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println(" 订购披萨失败 ");
                break;
            }
        }while(true);
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
