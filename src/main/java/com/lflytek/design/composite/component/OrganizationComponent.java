package com.lflytek.design.composite.component;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @createDate:2021/6/21
 */
@Data
@AllArgsConstructor
public abstract class OrganizationComponent {
    private String name;
    private String des;

    public void add(OrganizationComponent component) {
        // 默认实现
        throw new UnsupportedOperationException();
    }

    public void remove(OrganizationComponent component){
        // 默认实现
        throw new UnsupportedOperationException();
    }

    // 子类都需要实现
    public abstract void print();
}
