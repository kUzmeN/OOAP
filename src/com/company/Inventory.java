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

        GuitarSpec guitarSpec = new GuitarSpec(builder, type, backWood, topWood, model);
        Guitar guitar = new Guitar(guitarSpec, serialNumber, price);
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

    public List<Guitar> search(GuitarSpec searchSpec) {
        List matchingGuitars = new LinkedList<>();
        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            GuitarSpec guitarSpec = (GuitarSpec) i.next();
            //Серийный номер игнорируеться т.к. он уникален
            //Цени игнорируется т.к. она уникальна

            Builder builder = searchSpec.getBuilder();
            if ((builder != null) && (!builder.equals("")) &&
                    (!builder.equals(guitarSpec.getBuilder())))
                continue;

            //Стринги которые сравниваем для модели сделаем lowerCase
            //Для того чтобы не было ошибок при сравнении разных регистров
            String model = searchSpec.getModel().toLowerCase();
            if ((model != null) && (!model.equals("")) &&
                    (!model.equals(guitarSpec.getModel().toLowerCase())))
                continue;
            Type type = searchSpec.getType();
            if ((type != null) && (!type.equals("")) &&
                    (!type.equals(guitarSpec.getType())))
                continue;
            Wood backWood = searchSpec.getBackWood();
            if ((backWood != null) && (!backWood.equals("")) &&
                    (!backWood.equals(guitarSpec.getBackWood())))
                continue;
            Wood topWood = searchSpec.getTopWood();
            if ((topWood != null) && (!topWood.equals("")) &&
                    (!topWood.equals(guitarSpec.getTopWood())))
                continue;
            matchingGuitars.add(guitarSpec
            );
        }

        return matchingGuitars;
    }
}

