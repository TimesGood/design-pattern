package com.zhangwenke.design_pattern.decorator.demo;

public class Demo {
    public static void main(String[] args) {
        String salaryRecords = "姓名,薪水\n张三,100000\n李四,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                                         new EncryptionDecorator(
                                             new FileDataSource("out/OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        System.out.println("- 输入 ----------------");
        System.out.println(salaryRecords);
        System.out.println("- 输出 --------------");
        System.out.println(plain.readData());
        System.out.println("- 解码 --------------");
        System.out.println(encoded.readData());
    }
}
