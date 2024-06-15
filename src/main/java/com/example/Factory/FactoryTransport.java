package com.example.Factory;

public class FactoryTransport {
    public static Itransport createTransport(String type) {
        switch (type) {
            case "airplane":
                return new Airplane();

            case "ship":
                return new Ship();
            case "vehicle":
                return new Vehicle();
            default:
                throw new IllegalArgumentException("Transport type not valid");
        }
    }
}
