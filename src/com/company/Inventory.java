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
        Instrument instrument = null;
        if (spec instanceof GuitarSpec) {
            instrument = new Guitar(serialNumber, price, (GuitarSpec) spec);
        } else if (spec instanceof MandolinSpec) {
            instrument = new Mandolin(serialNumber, price, (MandolinSpec) spec);
        }
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

    public List<Guitar> search(GuitarSpec searchSpec) {
        List matchingGuitars = new LinkedList<>();
        for (Iterator i = inventory.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar) i.next();

            //Делегируем!
            if (guitar.getSpec().matches(searchSpec))
                matchingGuitars.add(guitar);

        }

        return matchingGuitars;
    }

    public  List search(MandolinSpec searchSpec){
        List matchingMandolins = new LinkedList<>();
        for (Iterator i = inventory.iterator(); i.hasNext(); ) {
            Mandolin mandolin = (Mandolin) i.next();

            //Делегируем!
            if (mandolin.getSpec().matches(searchSpec))
                matchingMandolins.add(mandolin);

        }

        return matchingMandolins;

    }
}

