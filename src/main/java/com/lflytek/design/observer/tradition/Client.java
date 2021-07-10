package com.lflytek.design.observer.tradition;

import java.util.Optional;

/**
 * @createDate:2021/7/3
 */
public class Client {
    public static void main(String[] args) {
        CurrentConditions currentConditions = new CurrentConditions();
        WeatherData weatherData = new WeatherData(currentConditions);
        weatherData.setData(30f,150f,40f);
    }
}
