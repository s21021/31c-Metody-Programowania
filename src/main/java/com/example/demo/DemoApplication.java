package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Car car = new Car("BMW",8, "Green", 4);
		car.getEnginer(8);
		car.getKolor("red");
		car.getModel("BMW");
		car.getKoła(4);
		CarService.print_car(car);
		car.toString();


	}

}
