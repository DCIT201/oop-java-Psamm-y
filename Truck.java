public class Truck extends Vehicle implements IRentable{
    private int loadCapacity;
    private boolean hasShade;

    //Constructor for Car with parameters from super class (Vehicle)
    public Truck(String vehicleId, String model, double baseRentalRate,int loadCapacity) {
        super(vehicleId, model, baseRentalRate);
        this.loadCapacity=loadCapacity;
        this.hasShade=true;
    }


    public double calculateRentalCost(int days) {
        return getBaseRentalRate()*days*1.2;
    }


    public boolean isAvailableForRental() {
        return isAvailable();
    }

    public void rent(Customer customer,int days){
        if(isAvailableForRental()){
            setAvailable(false);
        }else {
            System.out.println("Truck is not available for rental now");
        }
    }
    public void returnVehicle(){
        setAvailable(true);
        System.out.println("Truck returned successfully");
    }
}
