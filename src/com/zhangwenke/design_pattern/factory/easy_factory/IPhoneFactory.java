package com.zhangwenke.design_pattern.factory.easy_factory;

import com.zhangwenke.design_pattern.factory.IPhone;

public class IPhoneFactory {
    public static IPhone create(Class<? extends IPhone> clazz) throws Exception{
        if(clazz != null) {
            return clazz.newInstance();
        }
        return null;
    }
}
