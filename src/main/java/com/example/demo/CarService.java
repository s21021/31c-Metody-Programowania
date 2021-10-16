package com.example.demo;

public class CarService {

    private int kola = 4;
    static void print_car(Car car) {
        System.out.print(car);
    }

    private void car_koła(Car car){
        if (car.getKoła() < 5){
            System.out.println("mamy 5 koła");
        } else {
            kola++;
            System.out.println("mamy 4 koło");

        }
    }

}
