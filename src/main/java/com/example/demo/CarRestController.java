package com.example.demo;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
public class CarRestController {
    private final CarService carService;

    public CarRestController(CarService carService) {
        this.carService = carService;
    }
    //h2 databases spring boot
    //responseEntity
    //generyczność

    @GetMapping
    public ResponseEntity<Car> printHelloWorld() {
        Car body = carService.carFind("opel","czarny");
        return ResponseEntity.ok(body);
    }
}
