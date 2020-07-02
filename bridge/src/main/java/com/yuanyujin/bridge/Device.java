package com.yuanyujin.bridge;

public interface Device {

    void enabled();

    void disabled();

    int getVolume();

    void setVolume(int volume);

    void printStatus();

    boolean isEnabled();
}
