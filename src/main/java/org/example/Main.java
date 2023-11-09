package org.example;

public class Main {
    public static void main(String[] args) {
        FleetOfCars cars = new FleetOfCars();

        Car cCar = new ElectricACar("electric","mercedes","A",2,100000,100);
    Car gCar= new Gasoline("gas","porsche","S",4,20);
    Car dCar = new DieselACar("Diesel","Hummer","S",4,15,false);
    cars.addCar(cCar);
    cars.addCar(gCar);
    cars.addCar(dCar);

        System.out.println("Total registration fee for the Fleet of cars:  " + cars.getRegistrationFeeForFleet());
        System.out.println(cCar);
        System.out.println(gCar);
        System.out.println(dCar);

    }

}