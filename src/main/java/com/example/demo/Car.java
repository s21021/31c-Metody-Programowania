package com.example.demo;

public class Car {
    private String Model;
    private int Enginer;
    private String kolor;
    private int Kola;

    public Car(String model, int enginer, String kolor, int kola) {
        Model = model;
        Enginer = enginer;
        this.kolor = kolor;
        Kola = kola;
    }

    public String getModel(String bmw) {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getEnginer(int i) {
        return Enginer;
    }

    public void setEnginer(int enginer) {
        Enginer = enginer;
    }

    public String getKolor(String red) {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public int getKoła(int i) {
        return Kola;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Model='" + Model + '\'' +
                ", Enginer=" + Enginer +
                ", kolor='" + kolor + '\'' +
                ", Kola=" + Kola +
                '}';
    }

}
