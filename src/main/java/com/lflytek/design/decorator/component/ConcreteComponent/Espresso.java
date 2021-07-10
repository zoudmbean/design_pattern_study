package com.lflytek.design.decorator.component.ConcreteComponent;

import com.lflytek.design.decorator.component.cache.Coffee;

/**
 * @createDate:2021/6/20
 * 意大利咖啡，继承缓冲层Coffee
 */
public class Espresso extends Coffee {

    public Espresso(){
        setDes("意大利咖啡");
        setPrice(6.0f);
    }

}
