public class Truck extends Vehicle{
    private int loadCapacity;

    //Constructor for Car with parameters from super class (Vehicle)
    public Truck(String vehicleId, String model, double baseRentalRate,int loadCapacity) {
        super(vehicleId, model, baseRentalRate);
        this.loadCapacity=loadCapacity;
    }


    public double calculateRentalCost(int days) {
        return getBaseRentalRate()*days+40;
    }


    public boolean isAvailableForRental() {
        return isAvailable();
    }
}
