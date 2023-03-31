package com.zhangwenke.design_pattern.decorator;

/**
 * 定义一个炸鸡接口的装饰器，对制作炸鸡方法进行一个增强
 */
public class FriedChickenDecorator implements FriedChicken{
    //内部维护一个炸鸡类
    private FriedChicken friedChicken;
    //通过构造方法把炸鸡类传递进来
    public FriedChickenDecorator(FriedChicken friedChicken){
        this.friedChicken = friedChicken;
    }

    /**
     * 然后你就可以为所欲为了
     */
    @Override
    public void makeFriedChicken() {
        this.friedChicken.makeFriedChicken();
        System.out.println("为所欲为的拓展方法");
    }
}
