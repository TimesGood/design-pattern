package com.zhangwenke.design_pattern.builder;

import com.zhangwenke.design_pattern.builder.conventional.AsusComputerbuilder;
import com.zhangwenke.design_pattern.builder.conventional.ComputerDirector;
import com.zhangwenke.design_pattern.builder.linked.SimpleComputerbuilder;

/**
 * 建造者模式：
 *  建造者模式是将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 *  用户只需指定需要建造的类型就可以获得对象，建造过程及细节不需要了解。
 * 建造者（Builder）模式包含如下角色：
 *  -抽象建造者类（Builder）：这个接口规定要实现复杂对象的那些部分的创建，并不涉及具体的部件对象的创建。
 *  -具体建造者类（ConcreteBuilder）：实现 Builder 接口，完成复杂产品的各个部件的具体创建方法。在构造过程完成后，提供产品的实例。
 *  -产品类（Product）：要创建的复杂对象。
 *  -指挥者类（Director）：调用具体建造者来创建复杂对象的各个部分，在指导者中不涉及具体产品的信息，只负责保证对象各部分完整创建或按某种顺序创建。
 *  适用场景：
 * 使用场景：
 *  适用于创建对象需要很多步骤，但是步骤顺序不一定固定。
 *  如果一个对象有非常复杂的内部结构（属性），把复杂对象的创建和使用进行分离。
 * 优点：
 *  -封装性好，创建和使用分离。
 *  -扩展性好，建造类之间独立、一定程度上解耦。
 * 缺点：
 *  -产生多余的Builder对象。
 *  -产品内部发生变化，建造者都要修改，成本较大。
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("常规：");
        System.out.println(excuseConventional());
        System.out.println("链式调用：");
        System.out.println(excuseLink());
    }

    public static Computer excuseConventional(){
        ComputerDirector director = new ComputerDirector(new AsusComputerbuilder());
        return director.construct();
    }
    public static Computer excuseLink(){
        SimpleComputerbuilder builder = new SimpleComputerbuilder();
        builder.builderMotherboard("Extreme主板");
        builder.builderCpu("Inter 12400k");
        builder.builderMemory("三星 16G*2");
        builder.builderDisk("三星980pro 2T");
        builder.builderGpu("铭瑄3070终结者");
        builder.builderPower("黑钻1000W");
        builder.builderHeatSink("随便风冷");
        builder.builderChassis("随便机箱");
        return builder.builder();
    }
}
