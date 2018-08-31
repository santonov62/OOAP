package com.santonov;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializelnventory(inventory);
        GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor",
                Type.ELECTRIC, Wood.INDIAN_ROSEWOOD, Wood.MAPLE, "12");
        List matchingGuitars = inventory.search(whatErinLikes);
        if (!matchingGuitars.isEmpty()) {
            System.out.println("Erin, you might like these guitars:");
            for (Iterator i = matchingGuitars.iterator(); i.hasNext();) {
                Guitar guitar = (Guitar) i.next();
                GuitarSpec spec = guitar.getSpec();
                System.out.println(spec.getBuilder() + " " +
                        spec.getModel() + " " +
                        spec.getType() + " guitar:\n " +
                        spec.getBackWood() + " back and sides,\n " +
                        spec.getTopWood() + " top.\nYou can have it for only $" +
                        guitar.getPrice() + "!\n----");
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

    private static void initializelnventory(Inventory inventory) {
        inventory.addGuitar("V95693", 1499.95, Builder.FENDER, "Stratocastor",
                Type.ELECTRIC, Wood.INDIAN_ROSEWOOD, Wood.MAPLE, "12");
        inventory.addGuitar("V9512", 1549.95, Builder.FENDER, "Stratocastor",
                Type.ELECTRIC, Wood.INDIAN_ROSEWOOD, Wood.MAPLE, "12");
        inventory.addGuitar("V9512", 1549.95, Builder.FENDER, "Stratocastor",
                Type.ELECTRIC, Wood.INDIAN_ROSEWOOD, Wood.MAPLE, "6");
    }
}
