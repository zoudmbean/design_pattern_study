package com.lflytek.design.observer.improve;

import com.lflytek.design.observer.improve.Observer.Observer;

/**
 *  接口，让WeatherData来实现
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
