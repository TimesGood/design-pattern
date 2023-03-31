package com.zhangwenke.design_pattern.proxy;

public class ShenZhenTrainStation implements TrainStation{
    @Override
    public void sellTickets() {
        System.out.println("深圳火车站售票了");
    }
}
