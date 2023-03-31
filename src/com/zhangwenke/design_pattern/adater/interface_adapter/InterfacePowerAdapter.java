package com.zhangwenke.design_pattern.adater.interface_adapter;

import com.zhangwenke.design_pattern.adater.object_adapter.Power;

/**
 * 接口适配器
 *  接口适配器主要为了解决类臃肿的问题，当我们需要12V、24V、30V...及更多时，
 *  我们还需要在建立新的接口，这种就有种得不偿失了
 *  像这种在对象适配器的基础上，目标接口定义了一些特征相似的方法，称为接口适配器
 */
public class InterfacePowerAdapter implements DCTarget {
    private Power adapter;

    public InterfacePowerAdapter(Power adapter){
        this.adapter = adapter;
    }
    @Override
    public int output5() {
        //处理逻辑
        return 5;
    }

    @Override
    public int output12() {
        //处理逻辑
        return 12;
    }

    @Override
    public int output24() {
        //处理逻辑
        return 24;
    }

    @Override
    public int output30() {
        //处理逻辑
        return 30;
    }
}