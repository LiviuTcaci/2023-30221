package demo;
public class Bicycle extends Vehicle{
    private String type; //e.g., mountain, city
    private boolean isElectric;

    public Bicycle(String registrationNumber, String make, String model, int year, boolean rented, double rentalRate, String type, boolean isElectric){
        super(registrationNumber, make, model, year, rented, rentalRate);
        this.type = type;
        this.isElectric = isElectric;
    }

    //>> Override the base method to calculate rental cost for bicycles.
    public double calculaterentalCost(int hours){
        double addCost = 1.0;
        return super.calculateRentalCost(hours) + addCost;
    }
}

