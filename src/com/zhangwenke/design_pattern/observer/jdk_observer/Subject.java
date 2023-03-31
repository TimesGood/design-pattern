package com.zhangwenke.design_pattern.observer.jdk_observer;

import java.util.Observable;

public class Subject extends Observable {
    private String name;

    public Subject(String name){
        this.name = name;
    }
    public void notifyMessage(String message) {
        System.out.println(this.name+"公众号发送了消息："+message+"请关注用户留意接收！");
        super.setChanged();
        super.notifyObservers(message);
    }

    public String getName() {
        return this.name;
    }
}
