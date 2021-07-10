package com.lflytek.design.factory.simple;

import com.lflytek.design.factory.simple.pizza.CheesePizza;
import com.lflytek.design.factory.simple.pizza.GreekPizza;
import com.lflytek.design.factory.simple.pizza.PepperPizza;
import com.lflytek.design.factory.simple.pizza.Pizza;

/**
 * @createDate:2021/6/4
 * 一个披萨的项目：要便于披萨种类的扩展，要便于维护
 *      1) 披萨的种类很多(比如 GreekPizz、CheesePizz 等)
 *      2) 披萨的制作有 prepare，bake, cut, box
 *      3) 完成披萨店订购功能。
 */
public class PiSaSimpleFactory {

    static Pizza pizza = null;

    public static Pizza makePizza(String type){
        switch (type){
            case "greek":
                pizza = new GreekPizza().setName(" 希腊披萨 ");
                break;
            case "cheese":
                pizza = new CheesePizza().setName(" 奶酪披萨 ");
                break;
            case "pepper":
                pizza = new PepperPizza().setName("胡椒披萨");
                break;
            default:
                pizza = null;
                break;
        }
        return pizza;
    }

}
