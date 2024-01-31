package com.zhangwenke.design_pattern.bridge.devices;

/**
 * 收音机
 */
public class Radio implements Device {
    /**设备状态**/
    private boolean on = false;
    /**音量**/
    private int volume = 30;
    /**频道**/
    private int channel = 1;

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
    }

    @Override
    public void disable() {
        on = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        if (volume > 100) {
            this.volume = 100;
        } else if (volume < 0) {
            this.volume = 0;
        } else {
            this.volume = volume;
        }
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| 收音机");
        System.out.println("| 状态 " + (on ? "开启" : "关闭"));
        System.out.println("| 当前音量 " + volume + "%");
        System.out.println("| 当前频道 " + channel);
        System.out.println("------------------------------------\n");
    }
}
