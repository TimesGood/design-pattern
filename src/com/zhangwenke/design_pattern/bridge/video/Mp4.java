package com.zhangwenke.design_pattern.bridge.video;

public class Mp4 implements Video {
    @Override
    public void decode(String fileName) {
        System.out.println("mp4视频文件："+fileName);
    }
}
