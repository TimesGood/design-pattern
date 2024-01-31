package com.zhangwenke.design_pattern.bridge;

import com.zhangwenke.design_pattern.bridge.devices.Device;
import com.zhangwenke.design_pattern.bridge.devices.Radio;
import com.zhangwenke.design_pattern.bridge.devices.Tv;
import com.zhangwenke.design_pattern.bridge.remotes.AdvancedRemote;
import com.zhangwenke.design_pattern.bridge.remotes.BasicRemote;


/**
 * 桥接模式
 *  桥接模式也称为桥梁模式、接口模式或者句柄（Handler and Body）模式，是将抽象部分与它的具体实现部分进行分离，
 *  使它们都可以独立的变化，通过组合的方式建立两个类之间的联系，而不是继承
 * 角色：
 *  抽象化（Abstraction）角色：定义抽象类，并包含一个对实现化对象的引用。
 *  拓展抽象化（Refined Abstraction）角色：是抽象化的角色的子类，实现父类中的业务方法，并通过组合关系调用实现化角色中的业务方法。
 *  实现化（Implementor）角色 ：定义实现化角色的接口，供扩展抽象化角色调用。
 *  具体实现化（Concrete Implementor）角色 ：给出实现化角色接口的具体实现。
 * 适用场景：
 *  -在抽象和具体实现之间需要增加更多的灵活性的场景。
 *  -一个类存在两个（或多个）独立变化的维度，而这两个（或多个）维度都需要独立进行扩展。
 *  -不希望使用继承，或因为多层继承导致系统类的个数剧增。
 * 优点
 *  -分离抽象部分及其具体实现部分。
 *  -提高了系统的扩展性。
 *  -符合开闭原型。
 *  -符合合成复用原则。
 * 缺点：
 *  -增加了系统的理解与设计难度。
 *  -需要正确地识别系统中两个独立变化的维度。
 */
public class Main {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("基础遥控器测试");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("高级遥控器测试");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
