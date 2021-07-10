package com.lflytek.design.observer.improve;

import com.lflytek.design.observer.improve.Observer.BaiduSite;
import com.lflytek.design.observer.improve.Observer.CurrentConditions;

/**
 * @createDate:2021/7/4
 */
public class Client {
    public static void main(String[] args) {
        // 创建WeatherData
        WeatherData data = new WeatherData();
        // 创建观察者
        CurrentConditions currentConditions = new CurrentConditions();
        BaiduSite baiduSite = new BaiduSite();

        // 注册
        data.registerObserver(currentConditions);
        data.registerObserver(baiduSite);

        data.setData(10f,50f,120f);
    }
}
