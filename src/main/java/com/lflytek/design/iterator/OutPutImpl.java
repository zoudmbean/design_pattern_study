package com.lflytek.design.iterator;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Iterator;
import java.util.List;

/**
 * @createDate:2021/7/3
 */
@Data
@AllArgsConstructor
public class OutPutImpl {
    // 学院集合
    private List<Colleage> colleages;

    // 遍历所有学院  然后调用printDepartment 输出各个学院的系
    public void printColleage(){
        // 从colleages取出所有的学院
        Iterator<Colleage> iterator = colleages.iterator();
        while (iterator.hasNext()){
            // 取出一个学院
            Colleage colleage = iterator.next();
            System.out.println("========================  " + colleage.getName());
            printDepartment(colleage.createIterator());
        }
    }


    // 输出  学院输出系
    public void printDepartment(Iterator iterator){
        while(iterator.hasNext()){
            DepartMent departMent = (DepartMent)iterator.next();
            System.out.println(departMent.getName());

        }
    }
}
