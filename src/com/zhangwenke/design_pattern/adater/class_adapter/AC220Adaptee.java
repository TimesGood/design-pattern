package com.zhangwenke.design_pattern.adater.class_adapter;

/**
 * 适配者（Adaptee）类：它是被访问和适配的现存组件库中的组件接口，相当于默认组件
 */
public class AC220Adaptee {
    /**
     * 要适配的类里面已经实现的原方法：上网
     */
    public int output(){
        System.out.println("输出交流电220V");
        return 220;
    }
}
