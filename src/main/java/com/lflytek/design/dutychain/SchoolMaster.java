package com.lflytek.design.dutychain;

/**
 * @createDate:2021/7/10
 * 校长
 */
public class SchoolMaster extends Approver{
    public SchoolMaster(String name) {
        super(name);
    }

    @Override
    public void processRequest(Request request) {
        if(request.getPrice() > 30000){
            System.out.println(" 请求编号id=" + request.getId() + " 被" + this.name + "处理了！");
            return;
        }
        // 形成一个环状，校长不愿意处理，交给第一级别的人处理
        System.out.println(this.name + "不想处理，接下来由" + this.nextApprover.name + "来处理：");
        this.nextApprover.processRequest(request);
    }
}
