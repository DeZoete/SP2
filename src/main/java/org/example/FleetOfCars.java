package org.example;

import java.util.ArrayList;

public class FleetOfCars {
    ArrayList <Car> cars = new ArrayList<Car>();

     public void addCar(Car car){
    cars.add(car);
     }
     public int getRegistrationFeeForFleet() {
         int totalRegistrationFee = 0;
         for (Car c : cars) {
             totalRegistrationFee += c.getRegistrationFee();
         }
         return totalRegistrationFee;
     }


    @Override
    public String toString(){
       return null;
    }
}
