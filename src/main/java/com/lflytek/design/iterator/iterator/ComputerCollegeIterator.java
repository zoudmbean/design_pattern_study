package com.lflytek.design.iterator.iterator;

import com.lflytek.design.iterator.DepartMent;

import java.util.Iterator;

/**
 * @createDate:2021/7/3
 * 计算机学院
 */
public class ComputerCollegeIterator implements Iterator {

    // 这里需要知道Department是以怎么样的方式存放
    DepartMent[] departMents;
    int position = 0; // 遍历位置，默认0

    public ComputerCollegeIterator(DepartMent[] departMents) {
        this.departMents = departMents;
    }

    // 判断是否还有下一个
    @Override
    public boolean hasNext() {
        if(position >= departMents.length || departMents[position] == null){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        return departMents[position++];
    }

    public void remove(){

    }
}
