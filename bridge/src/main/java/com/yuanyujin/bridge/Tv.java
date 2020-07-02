package com.yuanyujin.bridge;

public class Tv implements Device{

    private boolean on = true;

    private int volume = 60;

    public void enabled() {
        on = true;
    }

    public void disabled() {
        on = false;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        if(volume > 100){
            this.volume = 100;
        }else if(volume < 0){
            this.volume = 0;
        }else{
            this.volume = volume;
        }
    }

    public void printStatus() {
        System.out.println("------The Tv open is " + on);
        System.out.println("------The Tv volume is " + volume);
    }

    public boolean isEnabled() {
        return this.on;
    }
}
