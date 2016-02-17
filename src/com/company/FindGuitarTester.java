package com.company;



import java.util.Iterator;
import java.util.List;

//Класс FindGuitarTester тестирует поиск гитары по инвентарю, и выводит сообщение о результате.
public class FindGuitarTester {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, Type.ACOUSTIC, Wood.ALDER, Wood.ALDER, "Stratocastor");
        List<Guitar> matchingGuitar = inventory.search(whatErinLikes);

        if (!matchingGuitar.isEmpty()) {
            System.out.println("Erin you might like this guitars");
            for (Iterator i = matchingGuitar.iterator(); i.hasNext(); ) {
                Guitar guitar = (Guitar) i.next();
                GuitarSpec spec = guitar.getSpec();
                System.out.println("We have a :" +
                        spec.getBuilder() + " " + spec.getModel() + " " +
                        spec.getType() + "guitar:\n    " +
                        spec.getBackWood() + " back and sides ,\n  " +
                        spec.getTopWood() + " top.\n You can have it for only $" +
                        guitar.getPrice() + "!");
            }
        } else {
            System.out.println("Sorry, Erin,we have nothing for you.");
        }

    }


    private static void initializeInventory(Inventory inventory) {
        //Включение описаний гитар в каталог.
    }
}