package com.ricks.InventoryApp.models;


public class GuitarSpec {

    private EBuilder builder;
    private String model;
    private EType type;
    private EWood topWood;
    private EWood backWood;
    private int numStrings;

    public GuitarSpec(EBuilder builder, String model, EType type, 
        EWood topWood, EWood backWood, int numStrings) {
                this.builder = builder;
                this.model = model;
                this.type = type;
                this.topWood = topWood;
                this.backWood = backWood;
                this.numStrings = numStrings;
        }


    public EBuilder getBuilder() {
        return builder;
    }

    public void setBuilder(EBuilder builder) {
        this.builder = builder;
    }

    public String getModel() {
        return model;
    }

    public EType getType() {
        return type;
    }

    public void setType(EType type) {
        this.type = type;
    }

    public EWood getTopWood() {
        return topWood;
    }

    public void setTopWood(EWood topWood) {
        this.topWood = topWood;
    }

    public EWood getBackWood() {
        return backWood;
    }

    public void setBackWood(EWood backWood) {
        this.backWood = backWood;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }
    
    public boolean matches(GuitarSpec guitar) {
        
        if (!builder.equals(guitar.getBuilder()))
            return false;
        if (!model.equals(guitar.getModel()))
            return false;
        if (!type.equals(guitar.getType()))
            return false;
        if (!backWood.equals(guitar.getBackWood()))
            return false;
        if (!topWood.equals(guitar.getTopWood()))
            return false;

        return true;
    }

    
}