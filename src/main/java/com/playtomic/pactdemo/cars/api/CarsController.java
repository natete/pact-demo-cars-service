package com.playtomic.pactdemo.cars.api;

import com.playtomic.pactdemo.cars.domain.Car;
import com.playtomic.pactdemo.cars.service.CarsService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v1/cars", produces="application/json")
public class CarsController {

    private final CarsService service;

    public CarsController(CarsService service) {
        this.service = service;
    }

    @GetMapping(path = "/{car_id}")
    public List<Car> getUser(@PathVariable("car_id") String carId) {
        return service.getCars(carId);
    }

//    @PostMapping
//    public Car saveUser(@RequestBody CarRequestBody body) {
//        return service.saveCar(body);
//    }
}
