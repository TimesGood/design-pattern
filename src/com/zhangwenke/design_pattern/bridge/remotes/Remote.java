package com.zhangwenke.design_pattern.bridge.remotes;

/**
 * 所有远程控制设备接口
 */
public interface Remote {
    void power();

    void volumeDown();

    void volumeUp();

    void channelDown();

    void channelUp();
}
