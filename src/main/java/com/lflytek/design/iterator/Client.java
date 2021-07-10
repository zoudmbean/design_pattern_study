package com.lflytek.design.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @createDate:2021/7/3
 */
public class Client {
    public static void main(String[] args) {
        // 创建学院
        List<Colleage> colleages = new ArrayList<>();
        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();

        colleages.add(computerCollege);
        colleages.add(infoCollege);

        OutPutImpl outPut = new OutPutImpl(colleages);
        outPut.printColleage();
    }
}
