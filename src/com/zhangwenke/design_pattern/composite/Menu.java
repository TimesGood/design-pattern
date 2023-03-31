package com.zhangwenke.design_pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 菜单类
 */
public class Menu extends MenuComponent{
    private List<MenuComponent> menuList = new ArrayList<>();
    public Menu(String name,Integer level){
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(Integer i) {
        return menuList.get(i);
    }

    @Override
    public void print() {
        for (int i = 1;i < level;i++){
            System.out.print("  ");
        }
        System.out.println(">"+name);
        //如果菜单下还存在菜单或子菜单
        for(MenuComponent menu:menuList){
            menu.print();
        }
    }
}
