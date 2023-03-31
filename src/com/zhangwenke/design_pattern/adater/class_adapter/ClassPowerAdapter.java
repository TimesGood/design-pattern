package com.zhangwenke.design_pattern.adater.class_adapter;

import com.zhangwenke.design_pattern.adater.DC5Target;

/**
 * 适配器（Adapter）类：它是一个转换器，通过继承或引用适配者的对象，把适配者接口转换成目标接口，让客户按目标接口的格式访问适配者。
 * 类适配器
 * 像这种Adapter类既继承了Adaptee（被适配类），也实现了Target接口（因为Java不支持多继承，所以这样来实现）所以被称为类适配器
 * 缺点：
 *  类适配器有一个很明显的缺点，就是违背了合成复用原则。
 *  结合上面的例子，假如我不是220V的电压了，是380V电压呢？那就要多建一个380V电压的适配器了
 */
public class ClassPowerAdapter extends AC220Adaptee implements DC5Target {

    @Override
    public int output5() {
        //这里就可以处理功率的问题
        int output220 = super.output();
        int output5 = output220 / 44;
        System.out.println(output220+"V适配转换成"+output5+"V");
        return output5;
    }
}
