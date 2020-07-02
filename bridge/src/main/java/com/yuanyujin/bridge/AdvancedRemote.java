package com.yuanyujin.bridge;

public class AdvancedRemote extends BaseRemote{

    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute(){
        super.device.setVolume(0);
    }
}
