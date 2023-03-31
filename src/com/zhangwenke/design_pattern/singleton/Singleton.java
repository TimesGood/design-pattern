package com.zhangwenke.design_pattern.singleton;


/**
 * 静态内部类
 * 特点：
 *  效果类似DCL，只适用于静态域
 */
public class Singleton {

    private Singleton(){}
    public static final Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }


    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
}
