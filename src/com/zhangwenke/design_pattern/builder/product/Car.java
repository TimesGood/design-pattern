package com.zhangwenke.design_pattern.builder.product;

import com.zhangwenke.design_pattern.builder.components.Engine;
import com.zhangwenke.design_pattern.builder.components.GPSNavigator;
import com.zhangwenke.design_pattern.builder.components.Transmission;
import com.zhangwenke.design_pattern.builder.components.TripComputer;

/**
 * 汽车
 */
public class Car {
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
    /**燃料**/
    private double fuel = 0;

    public Car(CarType carType, int seats, Engine engine, Transmission transmission,
               TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        if (this.tripComputer != null) {
            this.tripComputer.setCar(this);
        }
        this.gpsNavigator = gpsNavigator;
    }

    public CarType getCarType() {
        return carType;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }
}
