package com.zhangwenke.design_pattern.factory.abstract_factory;

import com.zhangwenke.design_pattern.factory.IPhone;
import com.zhangwenke.design_pattern.factory.Honour;

/**
 * 抽象工厂：华为厂
 */
public class HuaweiFactory implements AbstractFactory {
    @Override
    public IPhone create() {
        return new Honour();
    }
}
