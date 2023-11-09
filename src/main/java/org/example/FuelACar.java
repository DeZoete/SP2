package org.example;

public abstract class FuelACar extends ACar { //bruger extends når jeg skal nedarve fra andre klasser
   protected int kmPrLitre;

    public FuelACar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre){
super(registrationNumber,make,model,numberOfDoors);
this.kmPrLitre = kmPrLitre;

    }

    public String getFuelType(){
        return null;
    }
    public int KmPrLitre(int kmPrLitre){ //bilen skal kunne køre 20 km/l hvilket vil sige afgiften på bilen bliver 330 kr
        this.kmPrLitre = kmPrLitre;
        return kmPrLitre;
    }
    @Override
    public String toString(){
        return null;
    }
}
