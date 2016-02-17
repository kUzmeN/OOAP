package com.company;


//Класс Guitar, обычная  - entity
public class Guitar {
    private Builder builder;
    private Type type;
    private Wood topWood;
    private Wood backWood;
    private  String serialNumber ,model;
    private double price;


    public Guitar(Builder builder, Type type, Wood topWood, Wood backWood, String serialNumber, String model, double price) {
        this.builder = builder;
        this.type = type;
        this.topWood = topWood;
        this.backWood = backWood;
        this.serialNumber = serialNumber;
        this.model = model;
        this.price = price;
    }

    public Builder getBuilder() {
        return builder;
    }

    public Type getType() {
        return type;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
}
