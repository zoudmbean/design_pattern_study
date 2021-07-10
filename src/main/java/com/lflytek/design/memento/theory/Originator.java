package com.lflytek.design.memento.theory;

import lombok.Data;

/**
 * @createDate:2021/7/4
 * 原始对象
 */
@Data
public class Originator {
    private String state;// 状态信息

    // 编写一个方法，用于保存状态对象Memento
    public Memento saveStateMemento(){
        return new Memento(state);
    }

    // 通过备忘录对象，恢复状态，只需要恢复state状态即可
    public void getStateFromMemento(Memento memento){
        this.state = memento.getState();
    }
}
