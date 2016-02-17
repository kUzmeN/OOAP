package com.company;

//Entity которая создана специально для использования в поиске.
//Т.к. в обычной Guitar не все поля использовались , а это не правильно
public class GuitarSpec {
    private Builder builder;
    private Type type;
    private Wood backWood, topWood;

    private String model;

    public GuitarSpec(Builder builder, Type type, Wood backWood, Wood topWood, String model) {
        this.builder = builder;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.model = model;
    }

    public Builder getBuilder() {
        return builder;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public String getModel() {
        return model;
    }
}