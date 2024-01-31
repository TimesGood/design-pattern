package com.zhangwenke.design_pattern.decorator;

/**
 * 麦当劳制作炸鸡的方式
 */
public class McDonald implements FriedChicken{
    @Override
    public void makeFriedChicken() {
        System.out.println("麦当劳制作炸鸡的方式");
    }
}
