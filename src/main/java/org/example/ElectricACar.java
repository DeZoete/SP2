package org.example;

public class ElectricACar extends ACar {

    private int batteryCapacity;
    private int maxRange;

    public ElectricACar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange){
        super(registrationNumber,make,model,numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }
    public int getBatteryCapacityKWh(){
return batteryCapacity;

    }
public int getMaxRangeKm(){
        return maxRange;
}
public int getWhPrKm(){
        return batteryCapacity/maxRange;

}
public int getRegistrationFee() {
        double KWh = 100/(getWhPrKm()/91.25);

    if (KWh >= 20 && KWh <= 50) {
        return 330;
    }else if(KWh >=15 && KWh <20){
        return 1050;
    } else if(KWh >=10 && KWh <15){
        return 2340;
    } else if(KWh >=5 && KWh <10){
        return 5500;
    }else if (KWh < 5){
        return 10470;
    } else { return 0;

    }
}
    @Override
    public String toString() {
        return "RegistrationNumber: " + getRegistrationNumber()
                + "\nMake: " + getMake()
                + "\nModel: " + getModel()
                + "\nNumber of Doors: " + getNumberOfDoors()
                + "\n MaxRange: " + getMaxRangeKm()
                + "\n BatteryCapacity: " + getBatteryCapacityKWh();
    }
}
