package com.zhangwenke.design_pattern.bridge.system;

import com.zhangwenke.design_pattern.bridge.video.Video;

/**
 * Windows系统
 */
public class Windows extends OperationSystem {
    public Windows(Video video) {
        super(video);
    }

    @Override
    public void play(String fileName) {
        video.decode(fileName);
    }
}
