package com.lflytek.design.factory.method;

/**
 * @createDate:2021/6/5
 */
public class TestDemo {
    public static void main(String[] args) {
        String loc = "bj";
        if (loc.equals("bj")) {
            //创建北京口味的各种Pizza
            new BjPizza();
        } else {
            //创建伦敦口味的各种Pizza
            new BjPizza();
        }
    }
}
