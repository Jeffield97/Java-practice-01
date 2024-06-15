package com.example;

import java.io.PrintStream;

import com.example.Abstract.House;
import com.example.Abstract.Impl.Employee;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Jeffield");
        employee.setAge(20);
        employee.setSalary(900.0);

        // Call to buildHouse
        House house = buildHouse();
        System.out.println(house.getOwner());
    }

    //Builder patron
    public static House buildHouse() {
        House house = new House.Builder().area(200.0).cost(300.0).owner("Jeffield").build();
        return house;
    }
}
