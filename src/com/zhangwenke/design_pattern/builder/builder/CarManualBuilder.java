package com.zhangwenke.design_pattern.builder.builder;

import com.zhangwenke.design_pattern.builder.components.Engine;
import com.zhangwenke.design_pattern.builder.components.GPSNavigator;
import com.zhangwenke.design_pattern.builder.components.Transmission;
import com.zhangwenke.design_pattern.builder.components.TripComputer;
import com.zhangwenke.design_pattern.builder.product.CarType;
import com.zhangwenke.design_pattern.builder.product.Manual;

/**
 * 具体手册建造者
 */
public class CarManualBuilder implements Builder{
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
