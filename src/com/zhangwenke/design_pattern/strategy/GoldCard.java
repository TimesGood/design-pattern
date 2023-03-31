package com.zhangwenke.design_pattern.strategy;

public class GoldCard implements VipCard{
    @Override
    public void discount() {
        System.out.println("金卡打7折");
    }
}
