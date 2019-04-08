package com.ricks.InventoryApp;

import java.util.List;
import com.ricks.InventoryApp.models.Guitar;
import com.ricks.InventoryApp.models.EWood;
import com.ricks.InventoryApp.models.EType;
import com.ricks.InventoryApp.models.EBuilder;

public class App 
{
    public static void main( String[] args )
    {
        Inventory inventory = initializeInventory(new Inventory());
        List<Guitar> guitars = inventory.search(new Guitar(null, 0, EBuilder.FENDER, "Stratocastor",
        EType.ELECTRIC, EWood.ALDER, EWood.ALDER));

        if (guitars.isEmpty()) {
            System.exit(0);
        } 

        for (Guitar guitar : guitars) {
            System.out.println("Erin, you might like this " + 
                guitar.getBuilder() + " " + guitar.getModel() + " " 
                + guitar.getType() + " guitar:\n    " + 
                guitar.getBackWood() + " back and sides,\n    " + 
                guitar.getTopWood() + " top.\nYou can have it for only $" + 
                guitar.getPrice() + "!\n -------------");
        }

        System.out.println("Thanks for Choosing Us");

    }

    private static Inventory initializeInventory(Inventory inventory) {
        inventory.addGuitar(new Guitar("v95693", 1499.95, EBuilder.FENDER, "Stratocastor",
            EType.ELECTRIC, EWood.ALDER, EWood.ALDER));
        inventory.addGuitar(new Guitar("V9993003", 122202.90, EBuilder.GIBSON, "Stratocastor",
            EType.ELECTRIC, EWood.ALDER, EWood.ALDER));
        return inventory;
    }
}
