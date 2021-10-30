package com.example.demo;

import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
@Service
public class CarService {

    private static int kola;
    static void print_car(Car car) {
        System.out.print(car);
    }

    public Car carFind (String model,String kolor){
        Car car = new Car("opel", 2,  "czarny",5);
        return car;
    }
//    public static void car_koła(Car car){
//        System.out.println("ilość kół");
//        int kolo = car.getKoła();
//        if (kolo > 5){
//            System.out.println("masz 4 koła");
//        } else {
//            System.out.println("masz 5 koł");
//            kola++;
//        }
//    }

}
