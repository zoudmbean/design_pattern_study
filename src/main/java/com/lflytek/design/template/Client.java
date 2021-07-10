package com.lflytek.design.template;

/**
 * @createDate:2021/6/26
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("------------------------------------");
        MilkTemplate redMilk = new RedMilk();
        redMilk.make();
        System.out.println("*********************************");
        MilkTemplate greenMilk = new GreenMilk();
        greenMilk.make();
    }
}
