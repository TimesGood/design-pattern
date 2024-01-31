package com.zhangwenke.design_pattern.factory.abstract_factory;

import com.zhangwenke.design_pattern.factory.product.phone.IPhone;
import com.zhangwenke.design_pattern.factory.product.phone.HuaWeiMetaPhone;
import com.zhangwenke.design_pattern.factory.product.wath.HuaWei4ProWatch;
import com.zhangwenke.design_pattern.factory.product.wath.IWatch;

/**
 * 具体工厂：华为
 */
public class HuaWeiFactory implements AbstractFactory {
    @Override
    public IPhone createPhone() {
        return new HuaWeiMetaPhone();
    }

    @Override
    public IWatch createWatch() {
        return new HuaWei4ProWatch();
    }
}
