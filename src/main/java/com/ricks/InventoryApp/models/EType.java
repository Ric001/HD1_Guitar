package com.ricks.InventoryApp.models;

public enum EType {
    ACOUSTIC, ELECTRIC;

    @Override
    public String toString() {
        switch(this) {
            case ACOUSTIC: return "acoustic";
            case ELECTRIC: return "electric";
            default: return "Type Value Not Allowed";
        }
    }
}