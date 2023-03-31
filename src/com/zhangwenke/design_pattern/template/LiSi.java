package com.zhangwenke.design_pattern.template;

/**
 * 具体子类（Concrete Class）
 */
public class LiSi extends DayOffProcess{
    @Override
    protected void summit() {
        System.out.println("李四签名");
    }

    @Override
    protected void signUp() {
        System.out.println("提交到市场部审批");
    }
}
