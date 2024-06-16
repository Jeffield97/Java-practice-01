package com.example.Prototype;

public class Normal extends PriceList {

    private String state;

    public Normal() {
        type = "normal";
    }

    public void setState(String state)
    {
        this.state = state;
    }
    
    public String getState()
    {
        return this.state;
    }
    @Override
    public Normal clone() {
        return (Normal) super.clone();
    }
}
