package com.zhangwenke.design_pattern.bridge.remotes;

import com.zhangwenke.design_pattern.bridge.devices.Device;

/**
 * 基础远程控制器
 */
public class BasicRemote implements Remote {
    protected Device device;

    public BasicRemote() {}

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        System.out.println("远程: 电源切换");
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    @Override
    public void volumeDown() {
        System.out.println("远程: 音量 下");
        device.setVolume(device.getVolume() - 10);
    }

    @Override
    public void volumeUp() {
        System.out.println("远程: 音量 上");
        device.setVolume(device.getVolume() + 10);
    }

    @Override
    public void channelDown() {
        System.out.println("远程: 频道 下");
        device.setChannel(device.getChannel() - 1);
    }

    @Override
    public void channelUp() {
        System.out.println("远程: 频道 上");
        device.setChannel(device.getChannel() + 1);
    }
}
