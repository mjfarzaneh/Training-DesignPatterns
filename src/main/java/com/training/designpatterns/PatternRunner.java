package com.training.designpatterns;

import com.training.designpatterns.facade.VideoConverterFacade;
import com.training.designpatterns.facade.converter.*;

import java.io.File;

public class PatternRunner {

    public static void main(String[] args) {
/*
        System.out.println("Conversion start ..");
        VideoFile sourceFile = new VideoFile("youtubevideo.ogg");

        Codec sourceCode = CodeFactory.extract(sourceFile);
        Codec destinationCodec = new MPEG4CompressionCodec();
        VideoFile buffer = BitrateReader.read(sourceFile, sourceCode);
        VideoFile intermediateFile = BitrateReader.convert(buffer, destinationCodec);

        AudioMixer audioMixer = new AudioMixer();
        File finalResult = audioMixer.fix(intermediateFile);

        System.out.println("Conversion completed.");
*/
        VideoConverterFacade converter = new VideoConverterFacade();
        File mp4 = converter.convert(new VideoFile("yotubevideo.ogg"), "mp4");
        System.out.println("*************");
        File ogg = converter.convert(new VideoFile("vimeovideo.mp4"),"ogg");


    }
}
