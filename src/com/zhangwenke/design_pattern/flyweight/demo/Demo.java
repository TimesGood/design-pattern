package com.zhangwenke.design_pattern.flyweight.demo;

import javax.swing.*;
import java.awt.*;

public class Demo {
    /**窗口大小**/
    static int CANVAS_SIZE = 500;
    /**树的数量**/
    static int TREES_TO_DRAW = 1000000;
    /**共享属性数量**/
    static int TREE_TYPES = 2;

    public static void main(String[] args) {
        Forest forest = new Forest();
        for (int i = 0; i < Math.floor(TREES_TO_DRAW / TREE_TYPES); i++) {
            //绿色树
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Summer Oak", Color.GREEN, "Oak texture stub");
            //橙色树
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Autumn Oak", Color.ORANGE, "Autumn Oak texture stub");
        }
        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        forest.setVisible(true);

        System.out.println(TREES_TO_DRAW + " 棵树");
        System.out.println("---------------------");
        System.out.println("内存使用:");
        System.out.println("树的大小 (8 bytes) * " + TREES_TO_DRAW);
        System.out.println("+ 共享属性大小 (~30 bytes) * " + TREE_TYPES + "");
        System.out.println("---------------------");
        System.out.println("总计: " + ((TREES_TO_DRAW * 8 + TREE_TYPES * 30) / 1024 / 1024) +
                "MB (而不是 " + ((TREES_TO_DRAW * 38) / 1024 / 1024) + "MB)");
    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
