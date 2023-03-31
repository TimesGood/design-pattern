package com.zhangwenke.design_pattern.builder.conventional;

import com.zhangwenke.design_pattern.builder.Computer;

/**
 * 指挥者类，负责组装
 */
public class ComputerDirector {
    private ComputerBuilder computerBuilder;
    public ComputerDirector(ComputerBuilder computerBuilder){
        this.computerBuilder = computerBuilder;
    }
    public Computer construct(){
        computerBuilder.builderChassis();
        computerBuilder.builderCpu();
        computerBuilder.builderDisk();
        computerBuilder.builderGpu();
        computerBuilder.builderMemory();
        computerBuilder.builderMotherboard();
        computerBuilder.builderHeatSink();
        computerBuilder.builderPower();
        return computerBuilder.builder();
    }
}
