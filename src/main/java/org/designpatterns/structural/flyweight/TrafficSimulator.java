package org.designpatterns.structural.flyweight;

import org.designpatterns.structural.flyweight.manager.Vehicle;
import org.designpatterns.structural.flyweight.manager.VehicleFactory;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TrafficSimulator {

    static ArrayList<Vehicle> vehicles = new ArrayList();
    static VehicleFactory vehicleFactory = new VehicleFactory();

    public static void main(String[] args) {

        Runnable createVehicles = TrafficSimulator::createRandomCar;

        Runnable removeVehicles = TrafficSimulator::removeCar;

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(createVehicles, 0, 3, TimeUnit.SECONDS);
        executor.scheduleAtFixedRate(removeVehicles, 3, 5, TimeUnit.SECONDS);
    }

    private static void createRandomCar() {
        Random random = new Random();
        Vehicle vehicle = vehicleFactory.getVehicle(random.nextInt(2));
        vehicle.setLocation(random.nextInt(1000), random.nextInt(1000));
        System.out.println("Creating " + vehicle + ", type: " + vehicle.getModel() +
                ", location: " + vehicle.getLocation()[0] + " " + vehicle.getLocation()[1]);
        vehicles.add(vehicle);
    }

    private static void removeCar() {
        System.out.println("Removing " + vehicles.get(0));
        vehicles.remove(0);
    }
}
