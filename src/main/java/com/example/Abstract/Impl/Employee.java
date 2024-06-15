package com.example.Abstract.Impl;

import com.example.Abstract.Person;

public class Employee  extends Person{
    String range;
    Double salary;
    public String getRange() {
        return range;
    }
    public void setRange(String range) {
        this.range = range;
    }
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
