package com.lflytek.design.decorator.component;

import lombok.Data;

/**
 * @createDate:2021/6/20
 * 饮品类
 */
@Data
public abstract class Drink {
    public String des;
    private float price = 0.0f;

    // 计算费用的抽象方法
    // 子类来实现
    public abstract float coast();
}
