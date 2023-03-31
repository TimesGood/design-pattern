package com.zhangwenke.design_pattern.adater;

import com.zhangwenke.design_pattern.adater.class_adapter.ClassPowerAdapter;
import com.zhangwenke.design_pattern.adater.interface_adapter.DCTarget;
import com.zhangwenke.design_pattern.adater.interface_adapter.InterfacePowerAdapter;
import com.zhangwenke.design_pattern.adater.object_adapter.AC220Adaptee;
import com.zhangwenke.design_pattern.adater.object_adapter.ObjectPowerAdapter;

/**
 * 角色分析：
 *  适配器模式
 *  目标接口（Target）：客户所期待的接口。目标可以是具体的或抽象的类，也可以是接口。
 *  需要适配的类（Adaptee）：需要适配的类或适配者类。
 *  适配器（Adapter）：通过包装一个需要适配的对象，把原接口转换成目标接口。
 * 实现方式：
 *  (1).类适配器（采用继承实现）
 *  (2).对象适配器（采用对象组合方式实现）
 *  (3).接受适配器（对象适配器的基础上，增加目标类的实现方法）
 */
public class Main {
    public static void main(String[] args) {
        excuse();
        excuseObject();
        excuseInterface();
    }
    public static void excuse(){
        DC5Target adapter = new ClassPowerAdapter();
        //220V电压适配成5V电压
        adapter.output5();
        Phone phone = new Phone();
        //充电手机
        phone.charging(adapter);
    }
    public static void excuseObject(){
        AC220Adaptee adaptee = new AC220Adaptee();
        DC5Target adapter = new ObjectPowerAdapter(adaptee);
        //220V电压适配成5V电压
        adapter.output5();
        Phone phone = new Phone();
        //充电手机
        phone.charging(adapter);
    }
    public static void excuseInterface(){
        AC220Adaptee adaptee = new AC220Adaptee();
        DCTarget adapter = new InterfacePowerAdapter(adaptee);
        //220V电压适配成5V电压
        adapter.output5();
        Phone phone = new Phone();
        //充电手机
        phone.charging(adapter);
    }
}
