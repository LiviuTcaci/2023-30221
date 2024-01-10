package demo;
public class Car extends Vehicle{
    private int numberOfDoors;
    // we consider them false, if we have not initialized them
    private boolean hasAC;
    private boolean hasAutomaticTransmission;

    // Constructor
    public Car(String registrationNumber, String make, String model, int year, boolean rented, double rentalRate,
              int numberOfDoors, boolean hasAC, boolean hasAutomaticTransmission) {
        super(registrationNumber, make, model, year, rented, rentalRate);
        this.hasAC = hasAC;
        this.hasAutomaticTransmission = hasAutomaticTransmission;
        this.numberOfDoors = numberOfDoors;
    }
    //>> Override the base method to consider car-specific rental pricing
    @Override
    public double calculateRentalCost(int days){
        double addCost = 1.0;
        return super.calculateRentalCost(days) + addCost;
    }
}

