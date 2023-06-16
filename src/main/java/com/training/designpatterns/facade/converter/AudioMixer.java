package com.training.designpatterns.facade.converter;

import java.io.File;

public class AudioMixer {
    public File fix(VideoFile result) {
        System.out.println("convert.AudioMixer: fixing audio ..");
        return new File("tmp");
    }
}
