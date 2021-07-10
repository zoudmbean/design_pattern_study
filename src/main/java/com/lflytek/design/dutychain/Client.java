package com.lflytek.design.dutychain;


/**
 * @createDate:2021/7/10
 */
public class Client {
    public static void main(String[] args) {
        // 创建请求
        Request request = new Request(1,8000f,1001);

        // 创建处理人
        DepartmentApprover departMent = new DepartmentApprover("张主任");
        ColleageApprover colleageApprover = new ColleageApprover("李院长");
        FuSchoolMaster fuSchoolMaster = new FuSchoolMaster("刘副校长");
        SchoolMaster schoolMaster = new SchoolMaster("赵校长");

        // 设置各个处理人的下一责任人
        departMent.setNextApprover(colleageApprover);
        colleageApprover.setNextApprover(fuSchoolMaster);
        fuSchoolMaster.setNextApprover(schoolMaster);
        schoolMaster.setNextApprover(departMent);

        // 调用处理
        departMent.processRequest(request);

    }
}
