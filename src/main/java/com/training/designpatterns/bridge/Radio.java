package com.training.designpatterns.bridge;

public class Radio implements Device {
    private boolean enabled = false;
    private int chanel = 1;
    private int volume = 50;

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void turnOff() {
        System.out.println("Radio: turned off");
        enabled = false;
    }

    @Override
    public void turnOn() {
        System.out.println("Radio: turned on");
        enabled = true;
    }

    @Override
    public void setChanel(int chanel) {
        if (chanel < 1) {
            System.out.println("Radio: It's not possible to set chanel to 0");
        } else {
            System.out.println("Radio: chanel set to " + chanel);
            this.chanel = chanel;
        }
    }

    @Override
    public int getChanel() {
        return chanel;
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Radio: volume set to " + volume);
        if (volume < 0) {
            this.volume = 0;
        } else if (volume > 100) {
            this.volume = 100;
        } else {
            this.volume = volume;
        }
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void printStatus() {
        System.out.println("****************************");
        System.out.println("I am Radio");
        System.out.println("Radio is " + (enabled ? "on" : "off"));
        System.out.println("Volume is " + volume);
        System.out.println("Chanel is " + chanel);
        System.out.println("****************************");

    }
}
