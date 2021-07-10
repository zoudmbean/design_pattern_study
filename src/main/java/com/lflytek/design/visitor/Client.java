package com.lflytek.design.visitor;

/**
 * @createDate:2021/6/29
 */
public class Client {
    public static void main(String[] args) {
        // 1. 创建objectStructor
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man());
        objectStructure.attach(new Man());
        objectStructure.attach(new Man());

        // 成功
        Success success = new Success();
        objectStructure.display(success);

        System.out.println("==================");

        // 失败
        Fail fail = new Fail();
        objectStructure.display(fail);
    }
}
