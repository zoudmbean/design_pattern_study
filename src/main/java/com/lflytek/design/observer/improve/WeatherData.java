package com.lflytek.design.observer.improve;

import com.lflytek.design.observer.improve.Observer.Observer;
import com.lflytek.design.observer.tradition.CurrentConditions;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @createDate:2021/7/3
 * 核心类
 *      1. 包含最新的天气情况
 *      2. 包含 观察者 集合，使用List管理
 *      3. 当数据有更新时，主动调用 List，通知所有的接入者看到最新的消息
 */
@Data
public class WeatherData implements Subject{
    private Float temperature;  // 温度
    private Float pressure;     // 气压
    private Float humidity;     // 湿度

    private List<Observer> list = new ArrayList<>();

    // 推送最新信天气信息
    public void dataChange(){
        notifyObservers();
    }

    // 当数据有更新的时候，就调用setData
    public void setData(Float temperature,Float pressure,Float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    @Override
    public void registerObserver(Observer observer) {
        if(!list.contains(observer)){
            list.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if(list.contains(observer)){
            list.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        list.forEach(o -> {
            o.update(temperature,pressure,humidity);
        });
    }
}
