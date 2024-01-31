package com.zhangwenke.design_pattern.factory.abstract_factory;

import com.zhangwenke.design_pattern.factory.product.phone.IPhone;
import com.zhangwenke.design_pattern.factory.product.phone.XiaoMi8Phone;
import com.zhangwenke.design_pattern.factory.product.wath.IWatch;
import com.zhangwenke.design_pattern.factory.product.wath.XiaoMiS3Watch;

/**
 * 具体工厂：小米
 */
public class XiaoMiFactory implements AbstractFactory{
    @Override
    public IPhone createPhone() {
        return new XiaoMi8Phone();
    }

    @Override
    public IWatch createWatch() {
        return new XiaoMiS3Watch();
    }
}
