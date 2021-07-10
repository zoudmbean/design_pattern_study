package com.lflytek.design.memento.theory;

import lombok.Data;

/**
 * @createDate:2021/7/4
 */
@Data
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }
}
