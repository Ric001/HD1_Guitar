package com.ricks.InventoryApp.models;

public class Guitar 
{
    private String serialNumber;
    private double price;
    private String builder;
    private String model;
    private String type;
    private String backwood;
    private String topWood;

    public Guitar(String serialNumber, double price, String builder,
                    String model, String type, String backwood, 
                    String topWood) {
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
    
    public String getBuilder() 
    {
        return builder;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBackWood() {
        return backwood;
    }

    public void setBackWood(String backwood) {
        this.backwood = backwood;
    }

    public String getTopWood() {
        return topWood;
    }

    public void setTopWood(String topWood) {
        this.topWood = topWood;
    }
}