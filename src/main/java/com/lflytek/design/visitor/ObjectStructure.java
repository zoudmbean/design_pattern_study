package com.lflytek.design.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @createDate:2021/6/29
 * 数据结构，管理了很多人
 */
public class ObjectStructure {
    // 维护了一个集合
    private List<Person> persons = new LinkedList<>();

    // 增加到list
    public void attach(Person p) {
        persons.add(p);
    }

    // 移除
    public void detach(Person p){
        persons.remove(p);
    }

    // 显示测评情况
    public void display(Action action){
        persons.forEach(p -> p.accept(action));
    }
}
