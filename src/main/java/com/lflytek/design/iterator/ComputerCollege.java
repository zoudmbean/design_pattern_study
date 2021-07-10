package com.lflytek.design.iterator;

import com.lflytek.design.iterator.iterator.ComputerCollegeIterator;

import java.util.Iterator;

/**
 * @createDate:2021/7/3
 */
public class ComputerCollege implements Colleage {

    DepartMent[] departMents = new DepartMent[5];
    int numOfDepartment = 0;       // 保存当前数组的对象个数

    public ComputerCollege() {
        addDepartment("Java专业","Java专业");
        addDepartment("PHP专业","PHP专业");
        addDepartment("大数据专业","大数据专业");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        DepartMent departMent = new DepartMent(name, desc);
        departMents[numOfDepartment++] = departMent;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departMents);
    }
}
