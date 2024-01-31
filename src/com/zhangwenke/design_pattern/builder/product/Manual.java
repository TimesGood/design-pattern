package com.zhangwenke.design_pattern.builder.product;

import com.zhangwenke.design_pattern.builder.components.Engine;
import com.zhangwenke.design_pattern.builder.components.GPSNavigator;
import com.zhangwenke.design_pattern.builder.components.Transmission;
import com.zhangwenke.design_pattern.builder.components.TripComputer;

/**
 * 汽车手册
 */
public class Manual {
    /**汽车类型**/
    private final CarType carType;
    /**座位**/
    private final int seats;
    /**引擎**/
    private final Engine engine;
    /**变速器类型**/
    private final Transmission transmission;
    /**行程记录仪**/
    private final TripComputer tripComputer;
    /**导航系统**/
    private final GPSNavigator gpsNavigator;

    public Manual(CarType carType, int seats, Engine engine, Transmission transmission,
                  TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        String info = "";
        info += "汽车类型: " + carType + "\n";
        info += "座位数: " + seats + "\n";
        info += "引擎: 体积 - " + engine.getVolume() + "; 里程 - " + engine.getMileage() + "\n";
        info += "变速器类型: " + transmission + "\n";
        if (this.tripComputer != null) {
            info += "变速器: 运转正常" + "\n";
        } else {
            info += "变速器: N/A" + "\n";
        }
        if (this.gpsNavigator != null) {
            info += "GPS导航: 运转正常" + "\n";
        } else {
            info += "GPS导航: N/A" + "\n";
        }
        return info;
    }
}
