package com.example;

import java.io.PrintStream;
import java.util.logging.Logger;

import com.example.Abstract.Car;
import com.example.Abstract.House;
import com.example.Abstract.Impl.Employee;
import com.example.Constants.AppConstants;
import com.example.Dto.State;
import com.example.Factory.Airplane;
import com.example.Factory.FactoryTransport;
import com.example.Factory.Itransport;
import com.example.Factory.Ship;
import com.example.Factory.Vehicle;
import com.example.Singleton.DbConnection;

/**
 * @author Jeffield
 * @version 1.0
 *
 */
public class App {
    // Logger configuration
    static Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Jeffield");
        employee.setAge(20);
        employee.setSalary(900.0);

        // Call to buildHouse
        House house = buildHouse();
        logger.info(house.getOwner());

        // Call to buildCar
        Car car = buildCar();
        logger.info(car.getBrand());

        // Call singleton pattern
        singleton();

        // Call Factory pattern
        factory();
    }

    // Builder pattern
    public static House buildHouse() {
        return new House.Builder().area(200.0).cost(300.0).owner("Jeffield").build();
    }

    // Buider pattern
    public static Car buildCar() {
        return new Car.Builder().brand("BWM").color("Gray").cost(40000.0).state(State.New).build();
    }

    // Singleton patternS
    public static void singleton() {
        DbConnection dbConnection1 = new DbConnection().getInstance();
        DbConnection dbConnection2 = new DbConnection().getInstance();
        logger.info("\n\n*********** SINGLETON PATTERN (\"***********");
        logger.info("Hashcode:" + dbConnection1.hashCode());
        logger.info("Hashcode:" + dbConnection2.hashCode());
        logger.info(String.valueOf(dbConnection1 == dbConnection2));
    }

    // Factory transportation
    public static void factory() {
        logger.info("\n\n*********** FACTORY PATTERN (\"***********");

        Itransport airplane = FactoryTransport.createTransport(AppConstants.AIRPLANE);
        airplane.startEngine();

        Itransport ship = FactoryTransport.createTransport(AppConstants.SHIP);
        ship.startEngine();

        Itransport vehicle = FactoryTransport.createTransport(AppConstants.VEHICLE);
        vehicle.startEngine();
    }
}
