package com.example.Prototype;

import java.util.HashMap;

public abstract class PriceList implements IPrototype {
    String type;
    HashMap<String, Double> prices = new HashMap<String, Double>();

    public HashMap<String, Double> getPrices() {
        return prices;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public PriceList clone() {
        try {
            return (PriceList) super.clone();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    };
}
