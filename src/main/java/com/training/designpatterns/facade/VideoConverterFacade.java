package com.training.designpatterns.facade;

import com.training.designpatterns.facade.converter.*;

import java.io.File;

public class VideoConverterFacade {

    public File convert(VideoFile sourceFile, String codec) {
        System.out.println("VideoConverterFacade: Conversion start ..");

        Codec sourceCodec = CodeFactory.extract(sourceFile);
        Codec destinationCodec;
        if (codec.equals("mp4")) {
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }
        VideoFile buffer = BitrateReader.read(sourceFile, sourceCodec);
        VideoFile intermediateFile = BitrateReader.convert(buffer, destinationCodec);

        AudioMixer audioMixer = new AudioMixer();
        File finalResult = audioMixer.fix(intermediateFile);

        System.out.println("VideoConverterFacade: Conversion completed.");
        return finalResult;
    }
}
