package com.zhangwenke.design_pattern.strategy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 会员容器卡
 */
public class VipCardFactory {
    private static Map<String,VipCard> map = new ConcurrentHashMap<>();
    static{
        map.put("gold",new GoldCard());
        map.put("silver",new SilverCard());
        map.put("copper",new CopperCard());
    }
    public static VipCard getVIPCard(String level){
        return map.containsKey(level) ? map.get(level) : new Normal();
    }
}
