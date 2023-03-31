package com.zhangwenke.design_pattern.builder.conventional;

import com.zhangwenke.design_pattern.builder.Computer;

/**
 * 具体builder类
 */
public class AsusComputerbuilder implements ComputerBuilder{
    @Override
    public void builderMotherboard() {
        computer.setMotherboard("Extreme主板");
    }

    @Override
    public void builderCpu() {
        computer.setCpu("Inter 12400k");
    }

    @Override
    public void builderMemory() {
        computer.setMemory("三星 16G*2");
    }

    @Override
    public void builderDisk() {
        computer.setDisk("三星980pro 2T");
    }

    @Override
    public void builderGpu() {
        computer.setGpu("铭瑄3070终结者");
    }

    @Override
    public void builderPower() {
        computer.setPower("黑钻1000W");
    }

    @Override
    public void builderHeatSink() {
        computer.setHeatSink("随便风冷");
    }

    @Override
    public void builderChassis() {
        computer.setChassis("随便机箱");
    }

    @Override
    public Computer builder() {
        return computer;
    }
}
