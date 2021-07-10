package com.lflytek.design.observer.improve.Observer;

import lombok.Data;

/**
 * @createDate:2021/7/4
 */
@Data
public class CurrentConditions implements Observer{
    private Float temperature;  // 温度
    private Float pressure;     // 气压
    private Float humidity;     // 湿度

    @Override
    public void update(Float temperature,Float pressure,Float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display(){
        System.out.println("today 温度：" + temperature);
        System.out.println("today 气压：" + pressure);
        System.out.println("today 湿度：" + humidity);
    }
}
