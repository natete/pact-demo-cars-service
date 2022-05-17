package com.playtomic.pactdemo.cars.api;

import com.playtomic.pactdemo.cars.domain.CarNotFoundException;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CarsExceptionHandler {


    @ExceptionHandler(CarNotFoundException.class)
    public ResponseEntity handleUSerNotFoundException(CarNotFoundException ex) {
        Map<String, Object> body = Map.of("message", ex.getMessage());
        return new ResponseEntity(body, HttpStatus.NOT_FOUND);
    }

}
