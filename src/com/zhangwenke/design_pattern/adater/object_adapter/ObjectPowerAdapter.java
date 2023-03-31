package com.zhangwenke.design_pattern.adater.object_adapter;

import com.zhangwenke.design_pattern.adater.DC5Target;

/**
 * 适配器（Adapter）类：它是一个转换器，通过继承或引用适配者的对象，把适配者接口转换成目标接口，让客户按目标接口的格式访问适配者。
 * 对象适配器
 * 这种方式不是使用多继承或继承再实现的方式，而是使用直接关联，或者称为委托的方式
 * 优点：
 *  只实现了目标接口，并没有继承适配者，而是将适配者类实现适配者接口，
 *  在适配器中引入适配者接口，当我们需要使用不同的适配者通过适配器进行转换时，就无需再新建适配器类了
 */
public class ObjectPowerAdapter implements DC5Target {
    private Power adapter;

    public ObjectPowerAdapter(Power adapter){
        this.adapter = adapter;
    }
    @Override
    public int output5() {
        int output220 = this.adapter.output();
        //这里只是瞎写，可根据业务编写通用处理逻辑
        int output5 = output220 / 44;
        System.out.println(output220+"V适配转换成"+output5+"V");
        return output5;
    }
}
