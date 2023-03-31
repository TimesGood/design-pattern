package com.zhangwenke.design_pattern.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("饿汉式：");
        SingletonHunger instanceHunger = SingletonHunger.getInstance();
        SingletonHunger instanceHunger1 = SingletonHunger.getInstance();
        System.out.println(instanceHunger == instanceHunger1);

        System.out.println("===========================");

        System.out.println("懒汉式：");
        SingletonLazy instanceLazy = SingletonLazy.getInstance();
        SingletonLazy instanceLazy1 = SingletonLazy.getInstance();
        System.out.println(instanceLazy == instanceLazy1);

        System.out.println("===========================");

        System.out.println("静态内部类：");
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
    }
}
