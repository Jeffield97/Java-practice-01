package com.example.Builder;

import com.example.Dto.State;

public class Car {
    private String color;
    private String brand;
    private Double cost;
    private State state;

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public Double getCost() {
        return cost;
    }

    public State getState() {
        return state;
    }

    private Car(Builder builder) {
        this.brand = builder.brand;
        this.color = builder.color;
        this.cost = builder.cost;
        this.state = builder.state;
    }

    public static class Builder {
        private String color;
        private String brand;
        private Double cost;
        private State state;

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder cost(Double cost) {
            this.cost = cost;
            return this;
        }

        public Builder state(State state) {
            this.state = state;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
