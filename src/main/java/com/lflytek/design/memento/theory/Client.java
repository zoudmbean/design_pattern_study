package com.lflytek.design.memento.theory;

/**
 * @createDate:2021/7/4
 */
public class Client {
    public static void main(String[] args) {

        CareTaker ct = new CareTaker();

        Originator ori = new Originator();
        ori.setState(" 当前状态#100 ");
        ct.add(ori.saveStateMemento());

        ori.setState(" 当前状态#90 ");
        ct.add(ori.saveStateMemento());

        ori.setState(" 当前状态#80 ");
        ct.add(ori.saveStateMemento());

        System.out.println(ori.getState());
        System.out.println("---------------------");
        ori.getStateFromMemento(ct.get(0));
        System.out.println(ori.getState());

    }
}
