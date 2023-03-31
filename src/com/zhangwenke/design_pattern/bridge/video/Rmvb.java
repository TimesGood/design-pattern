package com.zhangwenke.design_pattern.bridge.video;

public class Rmvb implements Video {
    @Override
    public void decode(String fileName) {
        System.out.println("rmvb文件："+fileName);
    }
}
