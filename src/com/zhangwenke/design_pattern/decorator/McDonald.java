package com.zhangwenke.design_pattern.decorator;

public class McDonald implements FriedChicken{
    @Override
    public void makeFriedChicken() {
        System.out.println("麦当劳制作炸鸡的方式");
    }
}
