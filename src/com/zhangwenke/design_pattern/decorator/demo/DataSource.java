package com.zhangwenke.design_pattern.decorator.demo;

/**
 * 定义读取和写入操作的通用接口
 */
public interface DataSource {
    void writeData(String data);

    String readData();
}
