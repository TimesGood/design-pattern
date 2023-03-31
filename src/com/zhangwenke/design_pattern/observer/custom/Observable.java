package com.zhangwenke.design_pattern.observer.custom;

/**
 * 被观察者接口
 */
public interface Observable {
    // 新增用户（新增观察者）
    void add(Observer observer);
    // 移除用户，或者说取消订阅（移除观察者）
    void del(Observer observer);
    //发布，推送消息
    void notify(String message);
}
