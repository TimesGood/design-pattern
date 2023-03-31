package com.zhangwenke.design_pattern.builder.linked;

import com.zhangwenke.design_pattern.builder.Computer;

public class SimpleComputerbuilder {
    private Computer computer = new Computer();
    public SimpleComputerbuilder builderMotherboard(String motherboard){
        computer.setMotherboard(motherboard);
        return this;
    }
    public SimpleComputerbuilder builderCpu(String cpu){
        computer.setCpu(cpu);
        return this;
    }
    public SimpleComputerbuilder builderMemory(String memory){
        computer.setMemory(memory);
        return this;
    }
    public SimpleComputerbuilder builderDisk(String disk){
        computer.setDisk(disk);
        return this;
    }
    public SimpleComputerbuilder builderGpu(String gpu){
        computer.setGpu(gpu);
        return this;
    }
    public SimpleComputerbuilder builderPower(String power){
        computer.setPower(power);
        return this;
    }
    public SimpleComputerbuilder builderHeatSink(String heatSink){
        computer.setHeatSink(heatSink);
        return this;
    }
    public SimpleComputerbuilder builderChassis(String chassis){
        computer.setChassis(chassis);
        return this;
    }

    public Computer builder(){
        return computer;
    }
}
