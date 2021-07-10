package com.lflytek.design.iterator;

import com.lflytek.design.iterator.iterator.InfoColleageIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @createDate:2021/7/3
 */
public class InfoCollege implements Colleage {

    List<DepartMent> list = new ArrayList<>();

    public InfoCollege() {
        addDepartment("信息安全专业","信息安全专业");
        addDepartment("网络安全专业","网络安全专业");
        addDepartment("服务器安全专业","服务器安全专业");
    }

    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        list.add(new DepartMent(name,desc));
    }

    @Override
    public Iterator createIterator() {
        return new InfoColleageIterator(list);
    }
}
