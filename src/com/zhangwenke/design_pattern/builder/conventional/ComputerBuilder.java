package com.zhangwenke.design_pattern.builder.conventional;

import com.zhangwenke.design_pattern.builder.Computer;

public interface ComputerBuilder {
    Computer computer = new Computer();
    void builderMotherboard();
    void builderCpu();
    void builderMemory();
    void builderDisk();
    void builderGpu();
    void builderPower();
    void builderHeatSink();
    void builderChassis();
    Computer builder();
}
