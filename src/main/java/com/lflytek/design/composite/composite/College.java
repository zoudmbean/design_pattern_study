package com.lflytek.design.composite.composite;

import com.lflytek.design.composite.component.OrganizationComponent;

import java.util.ArrayList;
import java.util.List;

/**
 * @createDate:2021/6/21
 */
public class College extends OrganizationComponent {

    List<OrganizationComponent> list = new ArrayList<>();

    public College(String name, String des) {
        super(name, des);
    }

    @Override
    public void add(OrganizationComponent component) {
        list.add(component);
    }

    @Override
    public void remove(OrganizationComponent component) {
        list.remove(component);
    }

    @Override
    public void print() {
        System.out.println("-------------------" + super.getName() + "--------------------");
        list.forEach(OrganizationComponent::print);
    }
}
