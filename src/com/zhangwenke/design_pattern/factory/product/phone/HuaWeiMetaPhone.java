package com.zhangwenke.design_pattern.factory.product.phone;

/**
 * 具体产品：华为Meta
 */
public class HuaWeiMetaPhone implements IPhone {
    @Override
    public void call() {
        System.out.println("华为Meta打电话");
    }
}
