package com.playtomic.pactdemo.cars.service;

import com.playtomic.pactdemo.cars.dao.CarsRepository;
import com.playtomic.pactdemo.cars.domain.Car;
import org.springframework.stereotype.Service;

@Service
public class CarsService {

    private final CarsRepository repository;


    public CarsService(CarsRepository repository) {
        this.repository = repository;
    }


    public Car getCar(String id) {
        return repository.findById(id);
    }
}
