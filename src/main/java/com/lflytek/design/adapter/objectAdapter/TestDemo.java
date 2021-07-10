package com.lflytek.design.adapter.objectAdapter;

/**
 * @createDate:2021/6/15
 */
public class TestDemo {
    public static void main(String[] args) {
        System.out.println("类适配器模式：");
        Phone p = new Phone();
        p.charging(new VoltageAdapter(new Voltage220V()));
    }
}
