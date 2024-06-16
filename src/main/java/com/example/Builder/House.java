package com.example.Builder;

public class House {
    Double area;
    Double cost;
    String owner;

    public House(Builder builder) {
        this.area = builder.area;
        this.cost = builder.cost;
        this.owner = builder.owner;
    }

    public Double getArea() {
        return area;
    }

    public Double getCost() {
        return cost;
    }

    public String getOwner() {
        return owner;
    }

    public static class Builder {
        private Double area;
        private Double cost;
        private String owner;

        public Builder area(Double area) {
            this.area = area;
            return this;
        }

        public Builder cost(Double cost) {
            this.cost = cost;
            return this;
        }

        public Builder owner(String owner) {
            this.owner = owner;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }

}
