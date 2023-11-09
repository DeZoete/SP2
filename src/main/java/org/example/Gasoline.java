package org.example;

public class Gasoline extends FuelACar {

    public Gasoline(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
    }

    public String getFuelType() {
        return "Gasoline";
    }

    public int getRegistrationFee() {


        if (kmPrLitre >= 20 && kmPrLitre <= 50) {
            return 330;
        }else if(kmPrLitre >=15 && kmPrLitre <20){
            return 1050;
        } else if(kmPrLitre >=10 && kmPrLitre <15){
            return 2340;
        } else if(kmPrLitre >=5 && kmPrLitre <10){
            return 5500;
        }else if (kmPrLitre < 5){
            return 10470;
        } else { return 0;

        }

    }
    @Override
    public String toString(){
        return "RegistrationNumber: " + getRegistrationNumber()
                + "\nMake: " + getMake()
                + "\nModel: " + getModel()
                + "\nNumber of Doors: " + getNumberOfDoors()
                + "\n Drives this much km/l: " + kmPrLitre;
    }
}
