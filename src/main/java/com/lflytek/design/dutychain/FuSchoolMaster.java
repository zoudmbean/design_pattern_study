package com.lflytek.design.dutychain;

/**
 * @createDate:2021/7/10
 * 副校长
 */
public class FuSchoolMaster extends Approver{
    public FuSchoolMaster(String name) {
        super(name);
    }

    @Override
    public void processRequest(Request request) {
        if(request.getPrice() <= 30000 && request.getPrice() > 10000){
            System.out.println(" 请求编号id=" + request.getId() + " 被" + this.name + "处理了！");
            return;
        }
        System.out.println(this.name + "无法处理，接下来由" + this.nextApprover.name + "来处理：");
        this.nextApprover.processRequest(request);
    }
}
