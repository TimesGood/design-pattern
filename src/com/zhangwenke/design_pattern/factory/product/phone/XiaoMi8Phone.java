package com.zhangwenke.design_pattern.factory.product.phone;

/**
 * 具体产品：小米8
 */
public class XiaoMi8Phone implements IPhone{
    @Override
    public void call() {
        System.out.println("小米8打电话");
    }
}
