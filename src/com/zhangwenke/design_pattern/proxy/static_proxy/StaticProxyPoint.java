package com.zhangwenke.design_pattern.proxy.static_proxy;

import com.zhangwenke.design_pattern.proxy.GuangZhouTrainStation;
import com.zhangwenke.design_pattern.proxy.TrainStation;

public class StaticProxyPoint implements TrainStation {

    private TrainStation trainStation = new GuangZhouTrainStation();

    @Override
    public void sellTickets() {
        System.out.println("代售火车票收取5%手续费");
        trainStation.sellTickets();
    }
}
