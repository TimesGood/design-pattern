package com.zhangwenke.design_pattern.decorator;

/**
 * 装饰器是什么
 *  装饰器模式是指给一个类增强一些方法，对其进行一些包装，但是不会影响和改变原始类
 * 假设有一个公共接口（或抽象类，以接口为例），定义了一些公共方法，有许多类实现了该接口，如果我们想在每一个类的某些方法中在增加一些操作
 * 此时有两个解决方案：
 *  一、就是修改每个实现类中添加该拓展功能，要不然就是继承实现类，重写方法
 *  二、就是在调用这些方法之前做手段，实现这种操作有很多，比如代理、切面再就是我们的装饰器了
 * 装饰器的原理就是实现其公有接口，并在其中维护该接口，把实现该接口的类传递进来，取得该类之后在要拓展操作的方法中拓展业务
 * 装饰（Decorator）模式中的角色：
 *  -抽象构件（Component）角色 ：定义一个抽象接口以规范准备接收附加责任的对象。
 *  -具体构件（Concrete Component）角色 ：实现抽象构件，通过装饰角色为其添加一些职责。
 *  -抽象装饰（Decorator）角色 ： 继承或实现抽象构件，并包含具体构件的实例，可以通过其子类扩展具体构件的功能。
 *  -具体装饰（ConcreteDecorator）角色 ：实现抽象装饰的相关方法，并给具体构件对象添加附加的责任。
 * 装饰器模式与代理模式对比：
 *  -装饰器模式就是一种特殊的代理模式。
 *  -装饰器模式强调自身的功能扩展，用自己说了算的透明扩展，可动态定制的扩展；代理模式强调代理过程的控制。
 *  -获取目标对象构建的地方不同，装饰者是从外界传递进来的，可以通过构造方法传递；静态代理是在代理类内部创建，以此来隐藏目标对象
 * 适用场景：
 *  -用于扩展一个类的功能或者给一个类添加附加职责。
 *  -动态的给一个对象添加功能，这些功能同样也可以再动态的撤销。
 */
public class Main {
    public static void main(String[] args) {
        FriedChicken friedChicken = new KFC();
        System.out.println("未增强前:");
        friedChicken.makeFriedChicken();
        System.out.println("==============================");
        FriedChicken friedChicken1 = new FriedChickenDecorator(friedChicken);
        System.out.println("增强后:");
        friedChicken1.makeFriedChicken();
    }
}
