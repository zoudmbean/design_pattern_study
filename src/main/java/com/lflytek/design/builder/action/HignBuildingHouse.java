package com.lflytek.design.builder.action;

import com.lflytek.design.builder.HouseBuidler;

/**
 * @createDate:2021/6/15
 * 高楼
 */
public class HignBuildingHouse extends HouseBuidler {
    @Override
    public void buildBasic() {
        System.out.println("高楼打地基100M！");
    }

    @Override
    public void buildWall() {
        System.out.println("高楼砌墙30cm！");
    }

    @Override
    public void roofed() {
        System.out.println("高楼的透明屋顶！");
    }
}
