package com.zhangwenke.design_pattern.command.demo;

/**
 * 抽象基础命令
 */
public abstract class Command {
    public Editor editor;
    private String backup;

    Command(Editor editor) {
        this.editor = editor;
    }

    /**
     * 备份文本框内容
     */
    void backup() {
        backup = editor.textField.getText();
    }

    /**
     * 撤销
     */
    public void undo() {
        editor.textField.setText(backup);
    }

    public abstract boolean execute();
}
