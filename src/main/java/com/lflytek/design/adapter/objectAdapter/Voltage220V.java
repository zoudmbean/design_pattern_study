package com.lflytek.design.adapter.objectAdapter;

/**
 * @createDate:2021/6/15
 * 被适配的类
 */
public class Voltage220V {

    // 输出220V的电压
    public int outPut220V(){
        int src = 220;
        System.out.println("电压 = " + src + "V");
        return src;
    }
}
