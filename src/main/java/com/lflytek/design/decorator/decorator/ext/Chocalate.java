package com.lflytek.design.decorator.decorator.ext;

import com.lflytek.design.decorator.component.Drink;
import com.lflytek.design.decorator.decorator.Decorator;

/**
 * @createDate:2021/6/20
 * 具体的Decorator（装饰者）
 */
public class Chocalate extends Decorator {
    public Chocalate(Drink drink) {
        super(drink);
        setDes("巧克力");
        setPrice(3.5f);     // 调味品的价格
    }
}
