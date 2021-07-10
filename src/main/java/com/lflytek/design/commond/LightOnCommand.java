package com.lflytek.design.commond;

import lombok.AllArgsConstructor;

/**
 * @createDate:2021/6/27
 */
@AllArgsConstructor
public class LightOnCommand implements Commond {

    // 聚合receiver
    LightReceiver lightReceiver;

    @Override
    public void ecexute() {
        // 调用接收者的方法
        lightReceiver.on();
    }

    @Override
    public void undo() {
        // 调用接收者的方法
        lightReceiver.off();
    }
}
