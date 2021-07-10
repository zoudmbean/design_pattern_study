package com.lflytek.design.memento.game;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @createDate:2021/7/4
 * 守护者对象，保存游戏角色的状态
 */
@Data
public class CareTaker {
    // 如果只保存一次状态
    private Memento memento;
    // 对GameRole 保存多次状态
    //private List<Memento> mementoList;
    // 对多个游戏觉得保存多个状态
    //private Map<String,List<Memento>> rolsMementos;


}
