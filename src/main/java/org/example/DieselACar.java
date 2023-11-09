package org.example;

public class DieselACar extends FuelACar {
private boolean particleFilter;

    public DieselACar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean particleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.particleFilter = particleFilter;
    }

    public boolean hasParticleFilter(){

return particleFilter;

}

public int getRegistrationFee(){
    int particleFee = 0;
        if(!hasParticleFilter()){

            particleFee = 1000; //hvis bilen diesel bilen ikke har et partikelfilter så skal der ligger 1000 kroner oveni
        }


        if (kmPrLitre >= 20 && kmPrLitre <= 50) {
            return 130+particleFee;
        }else if(kmPrLitre >=15 && kmPrLitre <20){
            return 1390+particleFee;
        } else if(kmPrLitre >=10 && kmPrLitre <15){
            return 1850+particleFee;
        } else if(kmPrLitre >=5 && kmPrLitre <10){
            return 2770+particleFee;
        }else if (kmPrLitre < 5){
            return 15260+particleFee;
        } else { return 0;

        }

    }


@Override
public String toString(){
    return "RegistrationNumber: " + getRegistrationNumber()
            + "\nMake: " + getMake()
            + "\nModel: " + getModel()
            + "\nNumber of Doors: " + getNumberOfDoors()
            + "\n Drives this many km/l" + kmPrLitre
            + "\n Does it have a particleFilter? " + hasParticleFilter();

}
}
