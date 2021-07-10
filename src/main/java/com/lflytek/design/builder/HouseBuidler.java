package com.lflytek.design.builder;

import com.lflytek.design.builder.improve.House;

/**
 * @createDate:2021/6/15
 * 抽象的建造者：用于构建建造流程
 */
public abstract class HouseBuidler {
    protected House house = new House();

    // 建造的流程
    // 1. 打地基
    public abstract void buildBasic();
    // 2. 砌墙
    public abstract void buildWall();
    // 3. 盖房顶
    public abstract void roofed();
    // 4. 建造房子好，将房子（产品）返回
    public House buildHouse(){
        return house;
    }

}
