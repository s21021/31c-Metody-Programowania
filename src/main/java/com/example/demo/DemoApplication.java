package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

public class DemoApplication {
	@Autowired
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Car car = new Car("BMW",8, "Green", 4);
		car.getEnginer(8);
		car.getKolor("red");
		car.getModel("BMW");



	}

}
