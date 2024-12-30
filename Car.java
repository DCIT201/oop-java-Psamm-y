public class Car extends Vehicle implements IRentable{
    private String color;

    //Constructor for Car with parameters from super class (Vehicle)
    public Car(String vehicleId, String model, double baseRentalRate,String color) {
        super(vehicleId, model, baseRentalRate);
        this.color=color;
    }


    public double calculateRentalCost(int days) {
        return getBaseRentalRate()*days;
    }

    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public double rent(int days) {
        if (isAvailableForRental()){

        }
        setAvailable(false);
        return calculateRentalCost(days);
    }

    @Override
    public void returnVehicle() {

    }
}
