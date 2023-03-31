package com.zhangwenke.design_pattern.observer.jdk_observer;

import java.util.Observable;
import java.util.Observer;

public class WeixinUser implements Observer {
    private String name;
    public WeixinUser(String name){
        this.name = name;
    }
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name+"关注了公众号（被观察者）"+((Subject)o).getName()+"，接收到消息："+arg);
    }
}
