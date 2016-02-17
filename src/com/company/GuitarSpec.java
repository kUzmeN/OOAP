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

    //Метод который сравнивает на месте  свои же объекты
    // в чем его плюс , если мы добавим несколько полей , то сможем сразу же
    // добавить их в этот метод, в тоже время на клиенте,
    //менять ничего не придеться.
    public boolean matches(GuitarSpec searchSpec) {
        Builder builder = searchSpec.getBuilder();
        if (builder != searchSpec.getBuilder())
            return false;

        String model = searchSpec.getModel().toLowerCase();
        if ((model != null) && (!model.equals("")) &&
                (!model.equals(searchSpec.getModel().toLowerCase())))
            return false;
        Type type = searchSpec.getType();
        if (type != searchSpec.getType())
            return false;
        Wood backWood = searchSpec.getBackWood();
        if (backWood != searchSpec.getBackWood())
            return false;
        Wood topWood = searchSpec.getTopWood();
        if (topWood != searchSpec.getTopWood())
            return false;
        return true;
    }
}