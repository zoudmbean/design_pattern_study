package com.lflytek.design.facade;

/**
 * @createDate:2021/6/22
 */
public class Client {
    public static void main(String[] args) {
        HomeTheaterFacade home = new HomeTheaterFacade();
        home.ready();
        home.play();
    }
}
