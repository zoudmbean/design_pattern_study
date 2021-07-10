package com.lflytek.design.builder;

import com.lflytek.design.builder.action.CommonHouse;
import com.lflytek.design.builder.action.HignBuildingHouse;

/**
 * @createDate:2021/6/15
 */
public class TestDemo {
    public static void main(String[] args) {
        // 1. 盖普通房子
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector director = new HouseDirector(commonHouse);
        director.constructHouse();

        System.out.println("----------------------------------");

        // 2. 盖高楼
        HignBuildingHouse hignHouse = new HignBuildingHouse();
        director.setHouseBuidler(hignHouse);
        director.constructHouse();

    }
}
