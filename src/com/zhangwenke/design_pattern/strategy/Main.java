package com.zhangwenke.design_pattern.strategy;

/**
 * 策略模式（Strategy Pattern）
 *  策略模式又叫政策模式（Policy Pattern），它是将定义的算法家族分别封装起来，让它们之间可以互相替换，
 *  从而让算法的变化不会影响到使用算法的用户。可以避免多重分支的if......else和switch语句
 * 策略模式的主要角色如下：
 *  -抽象策略（Strategy）类：这是一个抽象角色，通常由一个接口或抽象类实现。此角色给出所有的具体策略类所需的接口。
 *  -具体策略（Concrete Strategy）类：实现了抽象策略定义的接口，提供具体的算法实现或行为。
 *  -环境（Context）类：持有一个策略类的引用，最终给客户端调用。
 * 适用场景：
 *  -系统中有很多类，而它们的区别仅仅在于它们的行为不同。
 *  -系统需要动态地在几种算法中选择一种。
 *  -需要屏蔽算法规则。
 */
public class Main {
    public static void main(String[] args) {
        VipCardFactory.getVIPCard("gold").discount();
        VipCardFactory.getVIPCard("copper").discount();
        VipCardFactory.getVIPCard("silver").discount();
        VipCardFactory.getVIPCard("other").discount();

    }
}
