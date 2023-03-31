package com.zhangwenke.design_pattern.strategy;

public class SilverCard implements VipCard{
    @Override
    public void discount() {
        System.out.println("银卡打8折");
    }
}
