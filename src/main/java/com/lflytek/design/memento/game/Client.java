package com.lflytek.design.memento.game;

/**
 * @createDate:2021/7/4
 */
public class Client {
    public static void main(String[] args) {
        // 创建游戏角色
        GameRole gr = new GameRole();
        gr.setVit(100);
        gr.setDef(100);

        System.out.println("大战前：");
        gr.display();

        // 把当前状态保存到careTaker
        CareTaker ct = new CareTaker();
        ct.setMemento(gr.createMemento());
        System.out.println("和boss大战。。。");
        gr.setDef(30);
        gr.setVit(40);
        System.out.println("大战后恢复。。。");
        gr.recoverGameRole(ct.getMemento());
        gr.display();

    }
}
