package com.zhangwenke.design_pattern.proxy.dynamic_proxy;

import com.zhangwenke.design_pattern.proxy.TrainStation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Jdk自带的动态代理
 *  代理对象必须有实现接口
 */
public class DynamicProxyPoint implements InvocationHandler {

    private TrainStation trainStation;

    public TrainStation getProxyObject(TrainStation trainStation){
        this.trainStation = trainStation;
        Class<? extends TrainStation> aClass = trainStation.getClass();
        return (TrainStation) Proxy.newProxyInstance(aClass.getClassLoader(),aClass.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代售火车票收取5%手续费");
        return method.invoke(this.trainStation,args);
    }
}
