package com.example;

import java.io.PrintStream;

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
    }

}
