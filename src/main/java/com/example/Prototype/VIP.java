package com.example.Prototype;

public class VIP extends PriceList {
    public VIP() {
        type = "vip";
    }

    @Override
    public PriceList clone() {
        return new VIP();
    }
}
