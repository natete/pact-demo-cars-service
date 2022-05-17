package com.playtomic.pactdemo.cars.domain;

public class CarNotFoundException extends RuntimeException {

    public CarNotFoundException() {
        super("The car does not exist");
    }
}
