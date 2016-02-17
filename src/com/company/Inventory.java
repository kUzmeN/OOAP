package com.company;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


//Класс Inventory осуществляет поиск гитары , а так же добавляет в инвентарь гитары
public class Inventory {
    private List guitars;

    public Inventory() {

        guitars = new LinkedList();
    }

    public void addGuitar(String serialNumber, double price, Builder builder,
                          String model, Type type, Wood backWood, Wood topWood) {
        Guitar guitar = new Guitar(builder,type,topWood,backWood,serialNumber,model,price);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar) i.next();
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public List<Guitar> search(Guitar searchGuitar) {
        List matchingGuitars = new LinkedList<>();
        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar) i.next();
            //Серийный номер игнорируеться т.к. он уникален
            //Цени игнорируется т.к. она уникальна

            Builder builder = searchGuitar.getBuilder();
            if ((builder != null) && (!builder.equals("")) &&
                    (!builder.equals(guitar.getBuilder())))
                continue;

            //Стринги которые сравниваем для модели сделаем lowerCase
            //Для того чтобы не было ошибок при сравнении разных регистров
            String model = searchGuitar.getModel().toLowerCase();
            if ((model != null) && (!model.equals("")) &&
                    (!model.equals(guitar.getModel().toLowerCase())))
                continue;
            Type type = searchGuitar.getType();
            if ((type != null) && (!type.equals("")) &&
                    (!type.equals(guitar.getType())))
                continue;
            Wood backWood = searchGuitar.getBackWood();
            if ((backWood != null) && (!backWood.equals("")) &&
                    (!backWood.equals(guitar.getBackWood())))
                continue;
            Wood topWood = searchGuitar.getTopWood();
            if ((topWood != null) && (!topWood.equals("")) &&
                    (!topWood.equals(guitar.getTopWood())))
                continue;
            matchingGuitars.add(guitar);
        }

        return matchingGuitars;
    }
}

