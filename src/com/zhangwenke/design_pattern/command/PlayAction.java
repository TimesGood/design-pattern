package com.zhangwenke.design_pattern.command;

/**
 * 具体命令（Concrete Command）角色：具体的命令，实现命令接口；通常会持有接收者，并调用接收者的功能来完成命令要执行的操作。
 */
public class PlayAction implements IAction{
    private Player player;
    public PlayAction(Player player){
        this.player = player;
    }
    @Override
    public void excuse() {
        player.play();
    }
}
