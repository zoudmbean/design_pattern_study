package com.lflytek.design.memento.game;

import lombok.Data;

/**
 * @createDate:2021/7/4
 */
@Data
public class GameRole {
    private Integer vit;
    private Integer def;

    // 创建Memento
    public Memento createMemento(){
        return new Memento(vit,def);
    }

    // 从备忘录对象恢复
    public void recoverGameRole(Memento m){
        this.vit = m.getVit();
        this.def = m.getDef();
    }

    // 显示当前角色的状态
    public void display(){
        System.out.println("游戏角色当前的攻击力：" + this.vit + "，防御力：" + this.def);
    }
}
