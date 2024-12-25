public class Motorcycle extends Vehicle{
    private boolean isElectric;

    public Motorcycle(String vehicleId, String model, double baseRentalRate,boolean isElectric) {
        super(vehicleId, model, baseRentalRate);
        this.isElectric=isElectric;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate()*days*0.8;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }
}
