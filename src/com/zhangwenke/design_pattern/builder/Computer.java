package com.zhangwenke.design_pattern.builder;

/**
 * 产品类 电脑
 */
public class Computer {
    private String motherboard;
    private String cpu;
    private String memory;
    private String disk;
    private String gpu;
    private String power;
    private String heatSink;
    private String chassis;

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getHeatSink() {
        return heatSink;
    }

    public void setHeatSink(String heatSink) {
        this.heatSink = heatSink;
    }

    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "motherboard='" + motherboard + '\'' +
                ", cpu='" + cpu + '\'' +
                ", memory='" + memory + '\'' +
                ", disk='" + disk + '\'' +
                ", gpu='" + gpu + '\'' +
                ", power='" + power + '\'' +
                ", heatSink='" + heatSink + '\'' +
                ", chassis='" + chassis + '\'' +
                '}';
    }
}
