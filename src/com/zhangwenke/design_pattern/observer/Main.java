package com.zhangwenke.design_pattern.observer;

import com.zhangwenke.design_pattern.observer.custom.Observable;
import com.zhangwenke.design_pattern.observer.custom.Subject;
import com.zhangwenke.design_pattern.observer.custom.WeixinUser;

/**
 * 观察者模式（Observer Mode）
 *  观察者模式，又叫发布-订阅（Publish/Subscribe）模式，模型-视图（Model/View）模式，
 *  源-监听器（Source/Listener）模式或从属者（Dependents）模式。定义一种一对多的依赖关系，
 *  一个主题对象可被多个观察者同时监听，使得每当主题对象状态变化时，所有依赖于它的对象都会得到通知并被自动更新。
 *
 */
public class Main {
    public static void main(String[] args) {
        jdk();
    }

    public static void custom(){
        Observable observable = new Subject();
        observable.add(new WeixinUser("张三"));
        observable.add(new WeixinUser("李四"));
        observable.add(new WeixinUser("王五"));
        observable.notify("某某发生什么大事");
    }
    public static void jdk(){
        com.zhangwenke.design_pattern.observer.jdk_observer.Subject observable = new com.zhangwenke.design_pattern.observer.jdk_observer.Subject("演唱会消息发布");
        observable.addObserver(new com.zhangwenke.design_pattern.observer.jdk_observer.WeixinUser("张三"));
        observable.addObserver(new com.zhangwenke.design_pattern.observer.jdk_observer.WeixinUser("李四"));
        observable.addObserver(new com.zhangwenke.design_pattern.observer.jdk_observer.WeixinUser("王五"));
        observable.addObserver(new com.zhangwenke.design_pattern.observer.jdk_observer.WeixinUser("赵六"));
        observable.notifyMessage("薛之谦演唱会要来广州了");
    }
}
