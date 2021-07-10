package com.lflytek.design.composite.composite;

import com.lflytek.design.composite.component.OrganizationComponent;

/**
 * @createDate:2021/6/21
 * 系
 */
public class Department extends OrganizationComponent {
    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    public void print() {
        System.out.println(super.getName());
    }
}
