package com.zhangwenke.design_pattern.bridge.system;

import com.zhangwenke.design_pattern.bridge.video.Video;

/**
 * Ios系统
 */
public class Ios extends OperationSystem {
    public Ios(Video video) {
        super(video);
    }

    @Override
    public void play(String fileName) {
        video.decode(fileName);
    }
}
