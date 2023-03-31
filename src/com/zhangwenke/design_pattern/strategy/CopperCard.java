package com.zhangwenke.design_pattern.strategy;

public class CopperCard implements VipCard{
    @Override
    public void discount() {
        System.out.println("铜卡打9折");
    }
}
