package com.zhangwenke.design_pattern.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 享元工厂（Flyweight Factory）
 */
public class TicketFactory {
    private static Map<String,ITicket> pool = new ConcurrentHashMap<>();
    public static ITicket getTicket(String from,String to){
        String key = from+"->"+to;
        if(pool.containsKey(key)){
            System.out.println("使用缓存获取火车票："+key);
            return pool.get(key);
        }
        System.out.println("使用数据库获取火车票："+key);
        TrainTicket ticket = new TrainTicket(from,to);
        //存入缓存，以便下次获取
        pool.put(key,ticket);
        return ticket;

    }
}
