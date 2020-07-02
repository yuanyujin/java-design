package com.yuanyujin.bridge;

public class Demo {

    public static void main(String[] args) {
        testDevice(new Tv());
        System.out.println("-----***-----");
        testDevice(new Radio());
    }

    public static void testDevice(Device device){
        BaseRemote baseRemote = new BaseRemote(device);
        baseRemote.power();
        baseRemote.volumeDown();
        device.printStatus();

        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.volumeUp();
        advancedRemote.mute();
        device.printStatus();
    }
}
