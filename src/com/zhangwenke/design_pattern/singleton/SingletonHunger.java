package com.zhangwenke.design_pattern.singleton;

public class SingletonHunger {
    //构造方法私有化
    private SingletonHunger(){}
    //饿汉式创建单例对象
    private static SingletonHunger singletonHunger = new SingletonHunger();

    public static SingletonHunger getInstance(){
        return singletonHunger;
    }
}
