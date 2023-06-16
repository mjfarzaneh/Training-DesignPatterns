package com.training.designpatterns.facade.converter;

public class CodeFactory {
    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();
        if (type.equals("mp4")) {
            System.out.println("convert.CodecFactory: extracting mpeg audio..");
            return new MPEG4CompressionCodec();
        } else {
            System.out.println("convert.CodecFactory: extracting ogg audio .. ");
            return new OggCompressionCodec();
        }
    }
}
