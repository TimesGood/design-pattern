package com.zhangwenke.design_pattern.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("饿汉式：");
        SingletonHunger instanceHunger = SingletonHunger.getInstance();
        SingletonHunger instanceHunger1 = SingletonHunger.getInstance();
        System.out.println(instanceHunger == instanceHunger1);
        System.out.println("懒汉式多线程：");
        Thread threadV1 = new Thread(new ThreadLazyV1());
        Thread threadV2 = new Thread(new ThreadLazyV2());
        threadV1.start();
        threadV2.start();
        System.out.println("静态内部类：");
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println("容器单例：");
        Thread threadC1 = new Thread(new ThreadC1());
        Thread threadC2 = new Thread(new ThreadC2());
        threadC1.start();
        threadC2.start();
    }

    static class ThreadLazyV1 implements Runnable {
        @Override
        public void run() {
            SingletonLazy lazy = SingletonLazy.getInstance("V1");
            System.out.println(lazy.value);
        }
    }
    static class ThreadLazyV2 implements Runnable {
        @Override
        public void run() {
            SingletonLazy lazy = SingletonLazy.getInstance("V2");
            System.out.println(lazy.value);
        }
    }
    static class ThreadC1 implements Runnable {
        @Override
        public void run() {
            try {
                ContainerObject c1 = (ContainerObject) ContainerSingleton.getInstance(ContainerObject.class, "C1");
                System.out.println(c1.value);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
    static class ThreadC2 implements Runnable {
        @Override
        public void run() {
            try {
                ContainerObject c2 = (ContainerObject) ContainerSingleton.getInstance(ContainerObject.class,"C2");
                System.out.println(c2.value);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

}
