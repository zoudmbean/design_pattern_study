package com.lflytek.design.iterator.iterator;

import com.lflytek.design.iterator.DepartMent;

import java.util.Iterator;
import java.util.List;

/**
 * @createDate:2021/7/3
 * 信息工程学院
 */
public class InfoColleageIterator implements Iterator {

    // 信息工程学院是以list的方式存放系
    List<DepartMent> departMentList;
    int index = -1;  // 索引

    public InfoColleageIterator(List<DepartMent> departMentList) {
        this.departMentList = departMentList;
    }

    @Override
    public boolean hasNext() {
        if(index >= departMentList.size()-1){
            return false;
        }
        index++;
        return true;
    }

    @Override
    public Object next() {
        return departMentList.get(index);
    }

    public void remove(){

    }
}
