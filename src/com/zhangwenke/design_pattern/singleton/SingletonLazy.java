package com.zhangwenke.design_pattern.singleton;

public class SingletonLazy {
    private static SingletonLazy singletonLazy;

    private SingletonLazy(){}
    /**
     * 懒汉式创建单例模式 由于懒汉式是非线程安全，加锁保证线程安全（不推荐）
     * @return
     */
//    public static synchronized SingletonLazy getInstance(){
//        if(singletonLazy == null) {
//            singletonLazy = new SingletonLazy();
//        }
//        return singletonLazy;
//    }

    /**
     * 饿汉式双重校验锁（推荐）
     *  特点：安全且在多线程情况下保持高性能
     * @return
     */

    public static SingletonLazy getInstance(){
        if(singletonLazy == null){
            synchronized (SingletonLazy.class){
                if(singletonLazy == null) {
                    singletonLazy = new SingletonLazy();
                }
            }
        }
        return singletonLazy;
    }
}
