package com.zhangwenke.design_pattern.builder.builder;

import com.zhangwenke.design_pattern.builder.components.Engine;
import com.zhangwenke.design_pattern.builder.components.GPSNavigator;
import com.zhangwenke.design_pattern.builder.components.Transmission;
import com.zhangwenke.design_pattern.builder.components.TripComputer;
import com.zhangwenke.design_pattern.builder.product.Car;
import com.zhangwenke.design_pattern.builder.product.CarType;

/**
 * 具体汽车建造者
 */
public class CarBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

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

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
