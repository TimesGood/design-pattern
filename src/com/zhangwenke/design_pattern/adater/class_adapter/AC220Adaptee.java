package com.zhangwenke.design_pattern.adater.class_adapter;

/**
 * 适配者（Adaptee）类：它是被访问和适配的现存组件库中的组件接口，相当于默认组件
 * 这里提供了220V的电压，手机需要5V电压，很明显这里不能满足手机充电的规格
 */
public class AC220Adaptee {

    public int output(){
        System.out.println("输出交流电220V");
        return 220;
    }
}
