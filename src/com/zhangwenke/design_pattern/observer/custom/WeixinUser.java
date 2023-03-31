package com.zhangwenke.design_pattern.observer.custom;

/**
 * 具体观察者：微信用户类
 */
public class WeixinUser implements Observer{
    private String name;

    public WeixinUser(String name){
        this.name = name;
    }
    @Override
    public void update(String message) {
        System.out.println(name+"接收到了消息："+message);
    }
}
