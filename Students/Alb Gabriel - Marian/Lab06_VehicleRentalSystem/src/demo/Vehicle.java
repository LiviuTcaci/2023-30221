package demo;

public class Vehicle {
    private String registrationNumber;
    private String make;
    private String model;
    private int year;
    private boolean rented;
    private double rentalRate;

    // Constructor
    public Vehicle(String registrationNumber, String make, String model, int year, boolean rented, double rentalRate) {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.year = year;
        this.rented = false;
        this.rentalRate = rentalRate;
    }

    //Methods
    //>> Mark the vehicle as rented.
    public void rent(){
        if(rented == true){
            System.out.println("The vehicle is already rented!");
        } else {
            rented = true;
            System.out.println("The vehicle is now rented!");
        }
    }

    //Getteres and setters
    // for registrationNumber
    public String getRegistrationNumber(){
        return registrationNumber;
    }
    public void setRegistrationNumber(String registrationNumber){
        this.registrationNumber = registrationNumber;
    }

    // for make
    public String getMake(){
        return make;
    }
    public void setMake(){
        this.make = make;
    }

    // for model
    public String getModel(){
        return model;
    }
    public void setModel(){
        this.model = model;
    }


    //>> Mark the vehicle as returned
    public void returnVehicle(){
        if(rented == true){
            rented = false;
            System.out.println("The vehicle is now returned!");
        } else {
            System.out.println("The vehicle is returned!");
        }
    }

    //>> Calculate the rental cost based on the number of days rented
    public double calculateRentalCost(int days){
        double result = rentalRate * days;
        return result;
    }

    public String toString(){
        String res;
        res = "Vehicle: " + "registrationNumber='" + registrationNumber + ", make='" + make +", model='" + model +
                ", year=" + year + ", rented=" + rented + ", rentalRate=" + rentalRate + ".";
        return  res;
    }

    // The main method
    public static void main(String[] args) {
        // --->>
        // From here we implement tools, objects and play with them
        //Exemple for Vehicel
        Vehicle tractor = new Vehicle("B 103 TRC", "UTB", "U650", 1981, true, 5.0);
        tractor.rent();
        System.out.println("Tractor rental cost is: " + tractor.calculateRentalCost(10) + " lei");
        tractor.returnVehicle();

        //Ex. for Car
        Car c1 = new Car("CJ 10 BOS", "BMW", "Seria A", 2023, false, 25.0, 4, true, true);
        c1.rent();
        System.out.println("Car rental cost is " + c1.calculateRentalCost(5) + " lei");
        c1.returnVehicle();

        //Ex. for Bicycle
        Bicycle bicycle = new Bicycle("DEF789", "Trek", "Mountain Bike", 2022, false, 8.0, "mountain", false);
        bicycle.rent();
        System.out.println("Bicycle rental cost is " + bicycle.calculateRentalCost(2) + " lei");
        bicycle.returnVehicle();

        //ex for motocycle
        Motocycle motorcycle = new Motocycle("MNO123", "Harley-Davidson", "Sportster", 2023, false, 30.0, 1200, true);
        motorcycle.rent();
        System.out.println("Motorcycle rental cost is " + motorcycle.calculateRentalCost(2) + " lei");
        motorcycle.returnVehicle();

        c1.setRegistrationNumber("CJ 01 BOS");
        System.out.println(c1.toString());
    }
}