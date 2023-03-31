package com.zhangwenke.design_pattern.proxy;

public class GuangZhouTrainStation implements TrainStation {
    @Override
    public void sellTickets() {
        System.out.println("广州火车站售票了");
    }
}
