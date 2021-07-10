package com.lflytek.design.decorator.decorator.ext;

import com.lflytek.design.decorator.component.Drink;
import com.lflytek.design.decorator.decorator.Decorator;

/**
 * @createDate:2021/6/20
 */
public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        setDes("奶油");
        setPrice(2.0f);
    }
}
