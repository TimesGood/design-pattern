package com.zhangwenke.design_pattern.command.demo;

import java.util.Stack;

/**
 * 历史命令记录
 */
public class CommandHistory {
    private Stack<Command> history = new Stack<>();

    public void push(Command c) {
        history.push(c);
    }

    public Command pop() {
        return history.pop();
    }

    public boolean isEmpty() { return history.isEmpty(); }
}
