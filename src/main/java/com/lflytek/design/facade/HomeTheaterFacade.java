package com.lflytek.design.facade;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @createDate:2021/6/22
 * 影院外观
 */
@Data
public class HomeTheaterFacade {

    // 定义各个子系统的对象
    private Light light;
    private PopCorm popCorm;
    private Stereo stereo;
    private Projector projector;
    private Screen screen;
    private DVDPlayer dvdPlayer;

    public HomeTheaterFacade() {
        this.light = Light.getInstance();
        this.popCorm = PopCorm.getInstance();
        this.stereo = Stereo.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.dvdPlayer = DVDPlayer.getInstance();
    }

    public void ready(){
        popCorm.on();
        popCorm.pop();
        screen.down();
        projector.on();
        stereo.on();
        dvdPlayer.on();
        light.dim();
    }

    public void play(){
        dvdPlayer.play();
    }

    public void pause(){
        dvdPlayer.pause();
    }

    public void end(){
        popCorm.off();
        light.bright();
        screen.up();
        stereo.off();
        projector.off();
        dvdPlayer.off();
    }
}
