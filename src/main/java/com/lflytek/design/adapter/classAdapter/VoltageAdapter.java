package com.lflytek.design.adapter.classAdapter;

/**
 * @createDate:2021/6/15
 * 适配器类
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int outPut5V() {
        // 获取到220V电压
        int src = outPut220V();
        // 转成5V
        int des = src / 44;
        return des;
    }
}
