package com.example;

import java.util.logging.Logger;

import com.example.Builder.Car;
import com.example.Builder.House;
import com.example.Abstract.Impl.Employee;
import com.example.Constants.AppConstants;
import com.example.Dto.State;
import com.example.Factory.FactoryTransport;
import com.example.Factory.Itransport;
import com.example.Prototype.Normal;
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

        // Abstract class
        Employee employee = new Employee();
        employee.setName("Jeffield");
        employee.setAge(20);
        employee.setSalary(900.0);

        // Call build pattern
        // builder();

        // Call singleton pattern
        // singleton();

        // Call Factory pattern
        // factory();

        // Call Prototype pattern
        prototype();
    }

    // Builder pattern
    public static void builder() {
        logger.info("\n\n*********** SINGLETON PATTERN (\"***********");

        House house = new House.Builder().area(200.0).cost(300.0).owner("Jeffield").build();
        logger.info(house.getOwner());

        Car car = new Car.Builder().brand("BMW").color("Gray").cost(30000.0).build();
        logger.info(car.getBrand());
    }

    // Singleton patternS
    public static void singleton() {
        DbConnection dbConnection1 = DbConnection.getInstance();
        DbConnection dbConnection2 = DbConnection.getInstance();
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

    // Prototype
    public static void prototype() {
        logger.info("\n\n*********** PROTOTYPE PATTERN (\"***********");
        Normal normalBase = new Normal();
        normalBase.setState("Habilitado");
        Normal normal1 = normalBase.clone();
        Normal normal2 = normalBase.clone();
        System.out.println("Objeto base:" + normalBase.getState() + ", " + normalBase.hashCode());
        System.out.println("Clon 1: " + normal1.getState() +", "+ normal1.hashCode());
        System.out.println("Clon 1: " + normal2.getState() + ", " + normal2.hashCode());
    }
}
