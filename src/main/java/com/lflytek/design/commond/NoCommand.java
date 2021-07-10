package com.lflytek.design.commond;

import lombok.AllArgsConstructor;

/**
 * @createDate:2021/6/27
 * 没有任何命令，即空执行，用于初始化每个按钮，当调用空命令的时候，对象什么事情都不做
 */
@AllArgsConstructor
public class NoCommand implements Commond{
    @Override
    public void ecexute() {
    }

    @Override
    public void undo() {
    }
}
