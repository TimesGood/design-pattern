package com.zhangwenke.design_pattern.singleton;

public class ContainerObject {
    public String value;
    public ContainerObject(String value){

        /**模拟耗时操作**/
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }
}
