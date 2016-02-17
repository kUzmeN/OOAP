package com.company;


//Класс Guitar, обычная  - entity
public class Guitar {
    private GuitarSpec spec;
    private String serialNumber;
    private double price;


    public Guitar(GuitarSpec spec, String serialNumber, double price) {
        this.spec = spec;
        this.serialNumber = serialNumber;
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public GuitarSpec getSpec() {
        return spec;
    }

    public double getPrice() {
        return price;
    }
}