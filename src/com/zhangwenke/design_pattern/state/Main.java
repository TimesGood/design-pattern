package com.zhangwenke.design_pattern.state;

/**
 * 状态模式也称为状态机模式（State Machine Pattern），是允许对象在内部状态发生改变时改变它的行为，对象看起来好像修改了它的类。
 * 状态模式包含以下主要角色：
 *  -环境（Context）角色：也称为上下文，它定义了客户程序需要的接口，维护一个当前状态，并将与状态相关的操作委托给当前状态对象来处理。
 *  -抽象状态（State）角色：定义一个接口，用以封装环境对象中的特定状态所对应的行为。
 *  -具体状态（Concrete State）角色：实现抽象状态所对应的行为。
 * 这个设计模式我不是很明白
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new StopState());
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
