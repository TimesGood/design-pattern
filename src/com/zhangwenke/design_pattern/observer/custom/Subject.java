package com.zhangwenke.design_pattern.observer.custom;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的被观察者：公众号
 */
public class Subject implements Observable {
    //观察者列表（订阅用户）
    private List<Observer> observers = new ArrayList<>();
    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void del(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notify(String message) {
        observers.forEach(observer -> observer.update(message));
    }
}
