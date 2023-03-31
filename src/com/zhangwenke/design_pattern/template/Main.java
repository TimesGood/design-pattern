package com.zhangwenke.design_pattern.template;

/**
 * 模板方法模式（Template method pattern）
 *  模板方法模式通常又叫模板模式，是指定义一个算法的骨架，并允许之类为其中的一个或者多个步骤提供实现。
 *  模板方法模式使得子类可以在不改变算法结构的情况下，重新定义算法的某些步骤。
 * 模板方法（Template Method）模式包含以下主要角色：
 *  -抽象类（Abstract Class）：负责给出一个算法的轮廓和骨架。它由一个模板方法和若干个基本方法构成。
 *      -模板方法：定义了算法的骨架，按某种顺序调用其包含的基本方法。
 *      -基本方法：是实现算法各个步骤的方法，是模板方法的组成部分。基本方法又可以分为三种：
 *      -抽象方法(Abstract Method) ：一个抽象方法由抽象类声明、由其具体子类实现。
 *      -具体方法(Concrete Method) ：一个具体方法由一个抽象类或具体类声明并实现，其子类可以进行覆盖也可以直接继承。
 *      -钩子方法(Hook Method) ：在抽象类中已经实现，包括用于判断的逻辑方法和需要子类重写的空方法两种。一般钩子方法是用于判断的逻辑方法，这类方法名一般为isXxx，返回值类型为boolean类型。
 *  -具体子类（Concrete Class）：实现抽象类中所定义的抽象方法和钩子方法，它们是一个顶级逻辑的组成步骤。
 * 适用场景：
 *  -一次性实现一个算法不变的部分，并将可变的行为留给子类来实现。
 *  -各子类中公共的行为被提取出来并集中到一个公共的父类中，从而避免代码重复。
 */
public class Main {
    public static void main(String[] args) {
        DayOffProcess zs = new ZhangSan();
        zs.dayOffProcess();

        DayOffProcess ls = new LiSi();
        ls.dayOffProcess();
    }
}
