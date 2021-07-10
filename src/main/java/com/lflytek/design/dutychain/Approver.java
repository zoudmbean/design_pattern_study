package com.lflytek.design.dutychain;

import lombok.Data;

/**
 * @createDate:2021/7/10
 * 抽象的处理人
 */
@Data
public abstract class Approver {
    Approver nextApprover;  // 下一个处理者
    String name;            // 名字

    public Approver(String name){
        this.name = name;
    }

    // 处理审批请求的方法，得到一个请求，请求由子类完成
    public abstract void processRequest(Request request);


}
