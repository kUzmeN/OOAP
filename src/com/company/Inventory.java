package com.company;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


//Класс Inventory осуществляет поиск инструментов
public class Inventory {
    private List inventory;

    public Inventory() {
        inventory = new LinkedList();
    }

    public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {
        Instrument instrument = new Instrument(serialNumber,price,spec);
        inventory.add(instrument);


    }

    public Instrument getInstrument(String serialNumber) {
        for (Iterator i = inventory.iterator(); i.hasNext(); ) {
            Instrument instrument = (Instrument) i.next();
            if (instrument.getSerialNumber().equals(serialNumber))
                return instrument;
        }
        return null;
    }

    //Новый поиск по всем инстурментам.
    public List search(InstrumentSpec searchSpec) {
        List matchingInstruments = new LinkedList();
        for (Iterator i = inventory.iterator(); i.hasNext(); ) {
           Instrument instrument = (Instrument)i.next();
            if (instrument.getSpec().matches(searchSpec))
                matchingInstruments.add(instrument);

        }
        return matchingInstruments;
    }


}

