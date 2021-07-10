package com.lflytek.design.adapter.objectAdapter;

/**
 * @createDate:2021/6/15
 */
public class Phone {
    public void charging(IVoltage5V iVoltage5V){
        if(iVoltage5V.outPut5V() == 5){
            System.out.println("电压为5V，可以充电！");
        } else if(iVoltage5V.outPut5V() > 5){
            System.out.println("电压 > 5V，不可以充电！");
        }
    }
}
