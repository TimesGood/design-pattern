package com.zhangwenke.design_pattern.template;

/**
 * 具体子类（Concrete Class）
 */
public class ZhangSan extends DayOffProcess {
    @Override
    protected void summit() {
        System.out.println("张三签名");
    }

    @Override
    protected void signUp() {
        System.out.println("提交到技术部审批");
    }
}
