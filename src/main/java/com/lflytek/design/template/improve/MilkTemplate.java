package com.lflytek.design.template.improve;

/**
 * @createDate:2021/6/26
 */
public abstract class MilkTemplate {

    public void make(){
        step1();
        if(ifNeed()){
            step2();
        }
        step3();
        step4();
    }

    protected void step1() {
        System.out.println("精选材料");
    }
    protected abstract void step2();
    protected void step3() {
        System.out.println("第三步");
    }
    protected void step4() {
        System.out.println("制作完成！");
    }

    // 定义钩子函数，默认返回true
    protected boolean ifNeed(){
        return true;
    }

}
