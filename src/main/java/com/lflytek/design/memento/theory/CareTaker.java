package com.lflytek.design.memento.theory;

import java.util.ArrayList;
import java.util.List;

/**
 * @createDate:2021/7/4
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento){
        mementoList.add(memento);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
