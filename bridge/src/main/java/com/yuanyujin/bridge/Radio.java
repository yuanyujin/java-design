package com.yuanyujin.bridge;

public class Radio implements Device{

    private boolean on = false;

    private int volume = 30;

    public void enabled() {
        on = true;
    }

    public void disabled() {
        on = false;
    }

    public int getVolume() {
        return volume;
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
        System.out.println("------The Radio open is " + on);
        System.out.println("------The Radio volume is " + volume);
    }

    public boolean isEnabled() {
        return this.on;
    }
}
