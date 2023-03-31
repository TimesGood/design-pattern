package com.zhangwenke.design_pattern.composite;

public class MenuItem extends MenuComponent{
    public MenuItem(String name,Integer level){
        this.name = name;
        this.level = level;
    }
    public void print() {
        for (int i = 1;i < level;i++){
            System.out.print("  ");
        }
        System.out.println("-"+name);
    }
}
