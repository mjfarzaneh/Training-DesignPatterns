package com.training.designpatterns.bridge;

public class AdvanceRemote extends BasicRemote {
    public AdvanceRemote(Device device) {
        super(device);
    }
    public void mute(){
        System.out.println("Advance Remote::mute()");
        super.device.setVolume(0);
    }
}
