package com.lflytek.design.builder;

import com.lflytek.design.builder.improve.House;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @createDate:2021/6/15
 * 指挥者：动态的指定制作流程，返回具体产品
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HouseDirector {
    private HouseBuidler houseBuidler;

    /*
    *   两种传入houseBuidler的方式
    * */
    // 1. 构造器方式传入houseBuidler
    // 2. setter方法传递houseBuilder

    // 建造房子的流程，交给指挥者
    public House constructHouse(){
        houseBuidler.buildBasic();
        houseBuidler.buildWall();
        houseBuidler.roofed();
        return houseBuidler.buildHouse();
    }

}
