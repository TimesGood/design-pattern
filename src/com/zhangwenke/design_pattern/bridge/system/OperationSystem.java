package com.zhangwenke.design_pattern.bridge.system;

import com.zhangwenke.design_pattern.bridge.video.Video;

public abstract class OperationSystem {
    protected Video video;
    public OperationSystem(Video video){
        this.video = video;
    }
    public abstract void play(String fileName);
}
