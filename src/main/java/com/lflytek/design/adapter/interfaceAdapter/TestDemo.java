package com.lflytek.design.adapter.interfaceAdapter;

/**
 * @createDate:2021/6/16
 */
public class TestDemo {
    public static void main(String[] args) {
        AbsAdapter adapter = new AbsAdapter() {
            @Override
            public void m1() {
                System.out.println("重写了m1方法");
            }
        };
        adapter.m1();
    }
}
