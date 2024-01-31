package com.zhangwenke.design_pattern.builder.builder;

import com.zhangwenke.design_pattern.builder.components.Engine;
import com.zhangwenke.design_pattern.builder.components.GPSNavigator;
import com.zhangwenke.design_pattern.builder.components.Transmission;
import com.zhangwenke.design_pattern.builder.components.TripComputer;
import com.zhangwenke.design_pattern.builder.product.CarType;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
