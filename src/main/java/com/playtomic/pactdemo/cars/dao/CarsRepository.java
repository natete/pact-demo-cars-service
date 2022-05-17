package com.playtomic.pactdemo.cars.dao;

import com.playtomic.pactdemo.cars.domain.Car;
import com.playtomic.pactdemo.cars.domain.CarNotFoundException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CarsRepository {

    private static final List<Car> cars = new ArrayList<>();

    public Car findById(String id) {
        return cars.stream().filter(u -> u.id().equals(id))
                   .findFirst()
                   .orElseThrow(CarNotFoundException::new);
    }

    public Car save(String maker, String model) {
        var car = new Car(String.valueOf(cars.size() + 1), maker, model);
        cars.add(car);
        return car;
    }

    public void clear() {
        cars.clear();
    }
}
