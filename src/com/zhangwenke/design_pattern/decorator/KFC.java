package com.zhangwenke.design_pattern.decorator;

/**
 * 肯德基制作炸鸡方式
 */
public class KFC implements FriedChicken{
    @Override
    public void makeFriedChicken() {
        System.out.println("肯德基制作炸鸡的方式");
    }
}
