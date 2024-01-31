package com.zhangwenke.design_pattern.factory.simple_factory;

import com.zhangwenke.design_pattern.factory.product.phone.IPhone;

/**
 * 简单工厂
 */
public class SimpleFactory {
    public static IPhone create(Class<? extends IPhone> clazz) throws Exception{
        if(clazz != null) {
            return clazz.newInstance();
        }
        return null;
    }
}
