package com.ricks.InventoryApp.models;

public class Guitar 
{
    private String serialNumber;
    private double price;
    private EBuilder builder;
    private String model;
    private EType type;
    private EWood backwood;
    private EWood topWood;

    public Guitar(String serialNumber, double price, EBuilder builder,
                    String model, EType type, EWood backwood, 
                    EWood topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model  = model;
        this.type = type;
        this.backwood = backwood;
        this.topWood = topWood;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    public EBuilder getBuilder() 
    {
        return builder;
    }

    public void setBuilder(EBuilder builder) {
        this.builder = builder;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public EType getType() {
        return type;
    }

    public void setType(EType type) {
        this.type = type;
    }

    public EWood getBackWood() {
        return backwood;
    }

    public void setBackWood(EWood backwood) {
        this.backwood = backwood;
    }

    public EWood getTopWood() {
        return topWood;
    }

    public void setTopWood(EWood topWood) {
        this.topWood = topWood;
    }

    @Override
    public boolean equals(Object incomingGuitar) {
        Guitar guitar = (Guitar) incomingGuitar;
        if (!builder.equals(guitar.getBuilder()))
            return false;
        if (!model.equals(guitar.getModel()))
            return false;
        if (!type.equals(guitar.getType()))
            return false;
        if (!backwood.equals(guitar.getBackWood()))
            return false;
        if (!topWood.equals(guitar.getTopWood()))
            return false;

        return true;
    }
}