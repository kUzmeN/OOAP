package com.company;


//Класс Guitar, обычная  - entity
public class Guitar {
    private  String serialNumber ,builder ,model , type , backWood , topWood;
    private double price;


    public Guitar(String serialNumber, double price,String builder, String model, String type, String backWood, String topWood) {
        this.serialNumber = serialNumber;
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getTopWood() {
        return topWood;
    }

    public String getBackWood() {
        return backWood;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getBuilder() {
        return builder;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}
