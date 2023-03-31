package com.zhangwenke.design_pattern.template;

/**
 * 抽象类（Abstract Class）
 */
public abstract class DayOffProcess {
    public final void dayOffProcess(){
        this.pickUpForm();
        this.writeInfo();
        this.signUp();
        this.summit();
        this.filing();
    }
    protected abstract void summit();
    protected abstract void signUp();
    private void pickUpForm(){
        System.out.println("领取申请表");
    }
    private void writeInfo(){
        System.out.println("填写申请信息");
    }
    private void filing(){
        System.out.println("行政部备案");
    }
}
