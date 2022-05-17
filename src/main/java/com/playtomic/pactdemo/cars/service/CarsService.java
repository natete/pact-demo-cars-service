package com.playtomic.pactdemo.cars.service;

import com.playtomic.pactdemo.cars.dao.CarsRepository;
import com.playtomic.pactdemo.cars.domain.Car;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CarsService {

    private final CarsRepository repository;


    public CarsService(CarsRepository repository) {
        this.repository = repository;
    }


    public List<Car> getCars(String id) {
        return repository.findAllById(id);
    }
}
