package com.training.designpatterns;

import com.training.designpatterns.bridge.*;

public class PatternRunner {

    public static void main(String[] args) {
        Device tv = new Tv();
        BasicRemote basicTvRemote = new BasicRemote(tv);
        basicTvRemote.power();
        basicTvRemote.chanelUp();
        basicTvRemote.volumeDown();
        basicTvRemote.power();
        tv.printStatus();

        Device radio = new Radio();
        BasicRemote basicRadioRemote = new BasicRemote(radio);
        basicRadioRemote.power();
        basicRadioRemote.chanelDown();
        basicRadioRemote.volumeDown();
        radio.printStatus();

        AdvanceRemote advanceRemote = new AdvanceRemote(radio);
        advanceRemote.mute();
        advanceRemote.chanelUp();
        radio.printStatus();
    }
}
