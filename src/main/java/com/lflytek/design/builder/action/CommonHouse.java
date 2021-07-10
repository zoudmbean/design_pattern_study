package com.lflytek.design.builder.action;

import com.lflytek.design.builder.HouseBuidler;

/**
 * @createDate:2021/6/15
 * 普通房子
 */
public class CommonHouse extends HouseBuidler {
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基5M！");
    }

    @Override
    public void buildWall() {
        System.out.println("普通房子砌墙10CM！");
    }

    @Override
    public void roofed() {
        System.out.println("盖普通房子屋顶！");
    }
}
