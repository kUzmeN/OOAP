package com.company;


//Класс Guitar, обычная  - entity
public class Guitar extends Instrument{
    private GuitarSpec spec;
    private String serialNumber;
    private double price;


    public Guitar(String serialNumber, double price,GuitarSpec spec) {
        super(serialNumber,price,spec);
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