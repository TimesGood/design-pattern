package com.zhangwenke.design_pattern.command;

/**
 * 实现者/接收者（Receiver）角色： 接收者，真正执行命令的对象。任何类都可能成为一个接收者，只要它能够实现命令要求实现的相应功能。
 */
public class Player {
    public void play(){
        System.out.println("正常播放");
    }
    public void pause(){
        System.out.println("暂停播放");
    }
    public void stop(){
        System.out.println("停止播放");
    }
}
