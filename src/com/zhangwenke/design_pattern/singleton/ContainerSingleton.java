package com.zhangwenke.design_pattern.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 容器式单例
 */
public class ContainerSingleton {
    private ContainerSingleton(){}
    private static Map<String,Object> singletonMap = new ConcurrentHashMap<>();
    public static Object getInstance(Class<?> clazz) throws Exception {
        String className = clazz.getName();
        //当容器中不存在该对象时再创建并返回
        if(!singletonMap.containsKey(className)){
            Object instance = Class.forName(className).newInstance();
            singletonMap.put(className,instance);
            return instance;
        }
        return singletonMap.get(className);
    }
}
