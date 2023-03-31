package com.zhangwenke.design_pattern.facade;

public class SmarSpeaker {
    private Fan fan;
    private Light light;
    private Tv tv;
    public SmarSpeaker(){
        fan = new Fan();
        light = new Light();
        tv = new Tv();
    }
    public void say(String order){
        if(order.contains("起床")){
            getUp();
        }else if(order.contains("睡觉")){
            sleep();
        }else{
            System.out.println("你在说什么？");
        }

    }

    private void getUp() {
        System.out.println("起床");
        fan.off();
        light.on();
        tv.on();
    }
    private void sleep() {
        System.out.println("睡觉");
        fan.on();
        light.off();
        tv.off();
    }
}
