package com.example.demo;

public class Car {
    private String Model;
    private float Enginer;
    private String kolor;

    public Car(String model, float enginer, String kolor) {
        Model = model;
        Enginer = enginer;
        this.kolor = kolor;
    }


    public void print() {
        System.out.print( "Car{" +
                "Model='" + Model + '\'' +
                ", Enginer=" + Enginer +
                ", kolor='" + kolor + '\'' +
                '}');
    }
}
