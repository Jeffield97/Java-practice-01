package com.example.Prototype;

public class Premium extends PriceList {
    public Premium() {
        type = "premium";
    }

    @Override
    public PriceList clone() {
        return new Premium();
    }
}
