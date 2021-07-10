package com.lflytek.design.observer.improve.Observer;

/**
 * 观察者接口，由观察者来实现
 */
public interface Observer {
    void update(Float temperatrue,Float pressure,Float humidity);
}
