package com.lflytek.design.decorator.decorator.ext;

import com.lflytek.design.decorator.component.Drink;
import com.lflytek.design.decorator.decorator.Decorator;

/**
 * @createDate:2021/6/20
 */
public class Soy extends Decorator {
    public Soy(Drink drink) {
        super(drink);
        setDes("豆浆");
        setPrice(0.5f);
    }
}
