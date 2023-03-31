package com.zhangwenke.design_pattern.adater;

import com.zhangwenke.design_pattern.adater.interface_adapter.DCTarget;

public class Phone {
    public void charging(DC5Target target) {
        if (target.output5() == 5) {
            System.out.println("电压正常，可以充电");
        } else {
            System.out.println("电压不正常，不能充电");
        }
    }
    public void charging(DCTarget target) {
        if (target.output5() == 5) {
            System.out.println("电压正常，可以充电");
        } else {
            System.out.println("电压不正常，不能充电");
        }
    }
}