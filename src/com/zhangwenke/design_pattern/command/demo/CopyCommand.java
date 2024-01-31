package com.zhangwenke.design_pattern.command.demo;

/**
 * 复制命令
 */
public class CopyCommand extends Command {

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.textField.getSelectedText() == null || editor.textField.getSelectedText().isEmpty()) return false;

        backup();
        editor.clipboard = editor.textField.getSelectedText();
        return true;
    }
}
