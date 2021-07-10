package com.lflytek.design.factory.abs.pizza;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @createDate:2021/6/5
 */
@Data
@Accessors(chain = true)
public abstract class Pizza {
    protected String name;

    public abstract void prepare();

    public void bake() {
        System.out.println(name + " baking;");
    }

    public void cut() {
        System.out.println(name + " cutting;");
    }

    public void box() {
        System.out.println(name + " boxing;");
    }
}
