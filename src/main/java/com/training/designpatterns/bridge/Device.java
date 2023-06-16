package com.training.designpatterns.bridge;

public interface Device {
    boolean isEnabled();

    void turnOff();

    void turnOn();

    void setChanel(int chanel);

    int getChanel();

    void setVolume(int volume);

    int getVolume();

    void printStatus();
}
