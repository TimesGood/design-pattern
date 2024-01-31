package com.zhangwenke.design_pattern.factory;

import com.zhangwenke.design_pattern.factory.abstract_factory.AbstractFactory;
import com.zhangwenke.design_pattern.factory.abstract_factory.HuaWeiFactory;
import com.zhangwenke.design_pattern.factory.abstract_factory.XiaoMiFactory;

public class Main {
    public static void main(String[] args) {
        configurePeople("华为");
    }

    public static void configurePeople(String product){
        People people;
        AbstractFactory factory;
        if("华为".equals(product)){
            factory = new HuaWeiFactory();
        }else{
            factory = new XiaoMiFactory();
        }
        people = new People(factory);
        people.call();
    }
}
