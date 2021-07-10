package com.lflytek.design.decorator.component.cache;

import com.lflytek.design.decorator.component.Drink;

/**
 * @createDate:2021/6/20
 * 咖啡
 */
public class Coffee extends Drink {
    @Override
    public float coast() {
        return super.getPrice();
    }
}
