package com.ricks.InventoryApp;

import java.util.LinkedList;
import java.util.List;
import com.ricks.InventoryApp.models.Guitar;
import com.ricks.InventoryApp.models.GuitarSpec;
public class Inventory {
    private List<Guitar> guitars;
    
    public Inventory() {
        guitars = new LinkedList<Guitar>();
    }

    public void addGuitar(Guitar guitar) {
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Guitar guitar : guitars) {
            if (guitar.getSerialNumber().equals(serialNumber))
                return guitar;
        }
        return null;
    }

    public List<Guitar> search(GuitarSpec searchGuitar) {
        List<Guitar> matchingGuitars = new LinkedList<Guitar>();
        for (Guitar guitar : guitars) {
            if (guitar.getSpecs().matches(searchGuitar))
                matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }
}