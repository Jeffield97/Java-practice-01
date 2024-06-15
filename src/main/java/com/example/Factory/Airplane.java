package com.example.Factory;

public class Airplane implements Itransport {
    @Override
    public void startEngine() {
        System.out.println("Start engine Auto");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop engine Auto");

    }
}