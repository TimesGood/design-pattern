package com.zhangwenke.design_pattern.factory;

import com.zhangwenke.design_pattern.factory.abstract_factory.AbstractFactory;
import com.zhangwenke.design_pattern.factory.product.phone.IPhone;
import com.zhangwenke.design_pattern.factory.product.wath.IWatch;

/**
 * 具体使用者
 */
public class People {
    private IPhone phone;
    private IWatch watch;

    public People(AbstractFactory factory){
        phone = factory.createPhone();
        watch = factory.createWatch();
    }
    public void call(){
        phone.call();
        watch.call();
    }
}
