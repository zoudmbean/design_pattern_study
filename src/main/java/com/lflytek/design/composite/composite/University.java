package com.lflytek.design.composite.composite;

import com.lflytek.design.composite.component.OrganizationComponent;

import java.util.ArrayList;
import java.util.List;

/**
 * @createDate:2021/6/21
 */
public class University extends OrganizationComponent {

    List<OrganizationComponent> list = new ArrayList<>();

    public University(String name, String des) {
        super(name, des);
    }

    // 重写add方法
    @Override
    public void add(OrganizationComponent component) {
        list.add(component);
    }

    // 重写remove
    @Override
    public void remove(OrganizationComponent component) {
        list.remove(component);
    }

    @Override
    public void print() {
        System.out.println("---------------" + super.getName() +  "-----------------");
        list.forEach(OrganizationComponent::print);
    }
}
