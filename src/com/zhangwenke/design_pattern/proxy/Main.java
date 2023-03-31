package com.zhangwenke.design_pattern.proxy;

import com.zhangwenke.design_pattern.proxy.dynamic_proxy.DynamicProxyPoint;
import com.zhangwenke.design_pattern.proxy.static_proxy.StaticProxyPoint;

public class Main {
    public static void main(String[] args) {
        System.out.println("静态代理：");
        StaticProxyPoint staticProxyPoint = new StaticProxyPoint();
        staticProxyPoint.sellTickets();
        System.out.println("================================");
        System.out.println("动态代理：");
        DynamicProxyPoint dynamicProxyPoint = new DynamicProxyPoint();
        TrainStation proxyObject = dynamicProxyPoint.getProxyObject(new GuangZhouTrainStation());
        proxyObject.sellTickets();

        TrainStation proxyObject1 = dynamicProxyPoint.getProxyObject(new ShenZhenTrainStation());
        proxyObject1.sellTickets();
    }
}
