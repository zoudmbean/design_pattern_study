package com.lflytek.design.template.improve;

/**
 * @createDate:2021/6/26
 */
public class WhiteMilk extends MilkTemplate{
    @Override
    protected void step2() {
        // 空实现
    }

    // 重写钩子函数

    @Override
    protected boolean ifNeed() {
        return false;
    }
}
