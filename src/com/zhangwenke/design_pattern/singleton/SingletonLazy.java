package com.zhangwenke.design_pattern.singleton;

public class SingletonLazy {
    private static SingletonLazy singletonLazy;
    public String value;

    private SingletonLazy(String value){
        /**模拟耗时操作**/
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }
    /**
     * 懒汉式创建单例模式 懒汉式在多线程情况下可能导致线程不安全
     * @return
     */
//    public static SingletonLazy getInstance(String value){
//        if(singletonLazy == null) {
//            singletonLazy = new SingletonLazy(value);
//        }
//        return singletonLazy;
//    }

    /**
     * 懒汉式双重校验锁（推荐）
     *  特点：安全且在多线程情况下保持高性能
     * @return
     */

    public static SingletonLazy getInstance(String value){
        if(singletonLazy == null){
            synchronized (SingletonLazy.class){
                if(singletonLazy == null) {
                    singletonLazy = new SingletonLazy(value);
                }
            }
        }
        return singletonLazy;
    }
}
