package com.company;


import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Guitar whatErinLikes = new Guitar(Builder.COLLINGS, Type.ELECTRIC, Wood.ALDER, Wood.INDIAN_WOOD, "", "", 0);
        List<Guitar> matchingGuitar = inventory.search(whatErinLikes);

        if (!matchingGuitar.isEmpty()) {
            System.out.println("Erin you might like this guitars");
            for (Iterator i = matchingGuitar.iterator(); i.hasNext();){
                Guitar guitar = (Guitar)i.next();
                System.out.println("We have a :"+
                        guitar.getBuilder() + " " + guitar.getModel() + " " +
                        guitar.getType() + "guitar:\n    " +
                        guitar.getBackWood() + " back and sides ,\n  " +
                        guitar.getTopWood() + " top.\n You can have it for only $" +
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