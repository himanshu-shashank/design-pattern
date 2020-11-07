package com.himanshu.designpattern.creational.builder.builders;


import com.himanshu.designpattern.creational.builder.cars.CarType;
import com.himanshu.designpattern.creational.builder.components.Engine;
import com.himanshu.designpattern.creational.builder.components.GPSNavigator;
import com.himanshu.designpattern.creational.builder.components.Transmission;
import com.himanshu.designpattern.creational.builder.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
