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
            Guitar guitar = (Guitar) i.next();

            //Делегируем!
            if (guitar.getSpec().matches(searchSpec))
                matchingGuitars.add(guitar);

        }

        return matchingGuitars;
    }
}

