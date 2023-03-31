package com.zhangwenke.design_pattern.factory.abstract_factory;

import com.zhangwenke.design_pattern.factory.IPhone;
import com.zhangwenke.design_pattern.factory.XiaoMi;

public class XiaoMiFactory implements AbstractFactory{
    @Override
    public IPhone create() {
        return new XiaoMi();
    }
}
