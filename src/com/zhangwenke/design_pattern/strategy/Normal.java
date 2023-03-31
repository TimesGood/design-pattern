package com.zhangwenke.design_pattern.strategy;

public class Normal implements VipCard{
    @Override
    public void discount() {
        System.out.println("普通会员没有折扣");
    }
}
