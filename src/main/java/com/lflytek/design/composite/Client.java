package com.lflytek.design.composite;

import com.lflytek.design.composite.component.OrganizationComponent;
import com.lflytek.design.composite.composite.College;
import com.lflytek.design.composite.composite.Department;
import com.lflytek.design.composite.composite.University;

/**
 * @createDate:2021/6/21
 */
public class Client {
    public static void main(String[] args) {
        // 从大到小创建对象

        // 1. 学校
        OrganizationComponent university = new University("清华大学","中国顶级高效");
        // 2. 学院
        OrganizationComponent c1 = new College("计算机学院", "计算机学院");
        OrganizationComponent c2 = new College("信息工程学院", "信息工程学院");
        // 3. 创建各个学院下的专业
        c1.add(new Department("软件工程","软件工程"));
        c1.add(new Department("网络工程","网络工程"));
        c1.add(new Department("计算机科学与技术","计算机科学与技术"));

        c2.add(new Department("通信工程","通信工程"));
        c2.add(new Department("信息工程","信息工程"));

        // 4. 将学院加入到学校中
        university.add(c1);
        university.add(c2);

        university.print();

    }
}
