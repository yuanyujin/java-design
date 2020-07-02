package com.yuanyujin.bridge;

public class BaseRemote implements Remote{

    protected Device device;

    public BaseRemote(Device device) {
        this.device = device;
    }

    public void power() {
        if(device.isEnabled()){
            device.disabled();
        }else{
            device.enabled();
        }
    }

    public void volumeDown() {
        device.setVolume(device.getVolume() - 10);
    }

    public void volumeUp() {
        device.setVolume(device.getVolume() + 10);
    }
}
