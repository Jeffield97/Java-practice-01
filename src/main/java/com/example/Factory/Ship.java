package com.example.Factory;

public class Ship implements Itransport {
    @Override
    public void startEngine() {
        System.out.println("Start engine ship");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop engine ship");
    }
}
