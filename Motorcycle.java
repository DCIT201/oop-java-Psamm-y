public class Motorcycle extends Vehicle implements IRentable {
    private boolean isElectric;
    private int speed;

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Motorcycle(String vehicleId, String model, double baseRentalRate, boolean isElectric, int speed) {
        super(vehicleId, model, baseRentalRate);
        this.isElectric = isElectric;
        this.speed=speed;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days * 0.8;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    public void rent(Customer customer,int days){
        if(isAvailableForRental()){
            setAvailable(false);
        }else {
            System.out.println("Motorcycle is not available for rental");
        }
    }
    public void returnVehicle(){
        setAvailable(true);
        System.out.println("Motorcycle return was successful");
    }
}
