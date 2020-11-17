package com.himanshu.designpattern.creational.builder.builders;

import com.himanshu.designpattern.creational.builder.cars.Car;
import com.himanshu.designpattern.creational.builder.cars.CarType;
import com.himanshu.designpattern.creational.builder.components.Engine;
import com.himanshu.designpattern.creational.builder.components.GPSNavigator;
import com.himanshu.designpattern.creational.builder.components.Transmission;
import com.himanshu.designpattern.creational.builder.components.TripComputer;


/**
 * Concrete builders implement steps defined in the common interface.
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

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}

