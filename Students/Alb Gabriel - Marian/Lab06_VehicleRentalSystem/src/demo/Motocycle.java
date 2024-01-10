package demo;
public class Motocycle extends Vehicle{
    private int engineDisplacement;
    private boolean isSportBike;

    // Constructor
    public Motocycle(String registrationNumber, String make, String model, int year, boolean rented, double rentalRate, int engineDisplacement, boolean isSportBike){
        super(registrationNumber, make, model, year, rented, rentalRate);
        this.engineDisplacement = engineDisplacement;
        this.isSportBike = isSportBike;
    }

    //>> Override the base method to determine motocycle-specific rental rates.
    public double calculateRentalCost(int days){
        double addCost = 1.0;
        return super.calculateRentalCost(days) + addCost;
    }
}

