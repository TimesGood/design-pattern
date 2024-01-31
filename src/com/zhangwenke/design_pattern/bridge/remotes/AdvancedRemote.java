package com.zhangwenke.design_pattern.bridge.remotes;

import com.zhangwenke.design_pattern.bridge.devices.Device;

public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("远程: 静音");
        device.setVolume(0);
    }
}
