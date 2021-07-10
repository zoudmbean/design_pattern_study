package com.iflytek.design_pattern_study.principle.singleresponsibility.Demo;

/**
 * @createDate:2021/5/31
 */
public class Demo1 {
    public static void main(String[] args) {
        new Vehicle().run("宝马");
        new Vehicle().run("自行车");
        new Vehicle().run("飞机");
    }
}

// 交通工具类
// 该run方法违反了单一职责原则
class Vehicle {
    public void run(String vehicle){
        System.out.println(vehicle + "在公路上运行。。。");
    }
}
