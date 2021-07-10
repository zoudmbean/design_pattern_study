package com.lflytek.design.commond;

import lombok.AllArgsConstructor;

/**
 * @createDate:2021/6/27
 */
@AllArgsConstructor
public class LightOffCommand implements Commond {

    LightReceiver lightReceiver;

    @Override
    public void ecexute() {
        lightReceiver.off();
    }

    @Override
    public void undo() {
        lightReceiver.on();
    }
}
