package com.ricks.InventoryApp;

import java.util.List;
import com.ricks.InventoryApp.models.Guitar;
import com.ricks.InventoryApp.models.EWood;
import com.ricks.InventoryApp.models.EType;
import com.ricks.InventoryApp.models.EBuilder;
import com.ricks.InventoryApp.models.GuitarSpec;
public class App 
{
    public static void main( String[] args )
    {
        Inventory inventory = initializeInventory(new Inventory());
        List<Guitar> guitars = inventory.search(new GuitarSpec(EBuilder.FENDER, "Stratocastor",
        EType.ELECTRIC, EWood.ALDER, EWood.ALDER, 12));

        if (guitars.isEmpty()) {
            System.exit(0);
        } 

        for (Guitar guitar : guitars) {
            GuitarSpec specs = guitar.getSpecs();
            System.out.println("Erin, you might like this " + 
                specs.getBuilder() + " " + specs.getModel() + " " 
                + specs.getType() + " guitar:\n    " + 
                specs.getBackWood() + " back and sides,\n    " + 
                specs.getTopWood() + " top.\nYou can have it for only $" + 
                guitar.getPrice() + "!\n -------------");
        }

        System.out.println("Thanks for Choosing Us");

    }

    private static Inventory initializeInventory(Inventory inventory) {
        inventory.addGuitar(new Guitar("v95693", 1499.95, new GuitarSpec(EBuilder.FENDER, "Stratocastor",
            EType.ELECTRIC, EWood.ALDER, EWood.ALDER ,11)));
        inventory.addGuitar(new Guitar("V9993003", 122202.90, new GuitarSpec(EBuilder.FENDER, "Stratocastor",
            EType.ELECTRIC, EWood.ALDER, EWood.ALDER, 11)));
        return inventory;
    }
}
