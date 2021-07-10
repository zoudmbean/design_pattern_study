package com.lflytek.design.observer.tradition;

import lombok.Data;

/**
 * @createDate:2021/7/3
 * 核心类
 *      1. 包含最新的天气情况
 *      2. 包含CurrentConditions对象
 *      3. 当数据有更新时，主动调用CurrentConditions的update方法
 */
@Data
public class WeatherData {
    private Float temperature;  // 温度
    private Float pressure;     // 气压
    private Float humidity;     // 湿度

    private CurrentConditions currentConditions;

    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
    }

    // 推送最新信天气信息
    public void dataChange(){
        currentConditions.update(temperature,pressure,humidity);
    }

    // 当数据有更新的时候，就调用setData
    public void setData(Float temperature,Float pressure,Float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }
}
