package com.zhangwenke.design_pattern.command;

/**
 * 命令模式（Command Pattern）
 *  命令模式是对命令的封装，每一个命令都是一个操作：请求的一方发出请求要求执行一个操作；接收的一方收到请求，并执行操作。
 *  命令模式解耦了请求方和接收方，请求方只需请求执行命令，不用关心命令是怎样被接收，怎样被操作以及是否被执行等。本质：解耦命令的请求与处理。
 * 命令模式包含以下主要角色：
 *  -抽象命令类（Command）角色： 定义命令的接口，声明执行的方法。
 *  -具体命令（Concrete Command）角色：具体的命令，实现命令接口；通常会持有接收者，并调用接收者的功能来完成命令要执行的操作。
 *  -实现者/接收者（Receiver）角色： 接收者，真正执行命令的对象。任何类都可能成为一个接收者，只要它能够实现命令要求实现的相应功能。
 *  -调用者/请求者（Invoker）角色： 要求命令对象执行请求，通常会持有命令对象，可以持有很多的命令对象。这个是客户端真正触发命令并要求命令执行相应操作的地方，也就是说相当于使用命令对象的入口。
 */
public class Main {
    public static void main(String[] args) {
        //调用者
        Controller invoker = new Controller();
        //接收者
        Player receiver = new Player();
        //具体命令
        IAction command = new PlayAction(receiver);
        //发送命令
        invoker.excuse(command);


    }
}
