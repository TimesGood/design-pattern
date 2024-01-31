package com.zhangwenke.design_pattern.adater;

/**
 * 目标（Target）接口：当前系统业务所期待的接口，它可以是抽象类或接口。
 * 手机要求5V电压才能给手机充电
 */
public interface DC5Target {
    int output5();
}
