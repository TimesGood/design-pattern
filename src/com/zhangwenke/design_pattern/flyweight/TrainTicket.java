package com.zhangwenke.design_pattern.flyweight;

import java.util.Random;

/**
 * 具体享元（Concrete Flyweight）
 * 火车票
 */
public class TrainTicket implements ITicket{
    private String from;
    private String to;
    private Integer price;
    public TrainTicket(String from,String to){
        this.from = from;
        this.to = to;
    }
    @Override
    public void show(String seat) {
        this.price = new Random().nextInt(500);
        System.out.println(from+"->"+to+":"+seat+"价格："+price);
    }
}
