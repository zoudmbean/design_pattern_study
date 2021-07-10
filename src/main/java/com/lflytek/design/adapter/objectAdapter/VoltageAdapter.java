package com.lflytek.design.adapter.objectAdapter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @createDate:2021/6/15
 * 适配器类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VoltageAdapter implements IVoltage5V {

    private Voltage220V voltage220V;

    @Override
    public int outPut5V() {
        int des = 0;
        if(voltage220V != null){
            System.out.println("220V电压开始转换。。。");
            // 获取到220V电压
            int src = voltage220V.outPut220V();
            // 转成5V
            des = src / 44;
            System.out.println("220V电压转换完毕。。。");
        }
        return des;
    }
}
