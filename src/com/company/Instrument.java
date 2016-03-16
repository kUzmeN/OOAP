package com.company;

/*
Абстрактный класс Instrument будет соддержать в себе общие свойства
для интсрументов,а также используеться как полиморфный тип.
 */

public  class Instrument {
    private String serialNumber;
    private double price;
    private InstrumentSpec spec;

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public Instrument(String serialNumber, double price, InstrumentSpec spec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = spec;
    }

    public InstrumentSpec getSpec() {
        return spec;
    }
}
