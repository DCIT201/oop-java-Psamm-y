public class Car extends Vehicle implements IRentable{
    private String color;
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



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
    public void rent (Customer customer,int days) {
        if (isAvailableForRental()){
            setAvailable(false); //
        }else{
            System.out.println("Car isn't available for rental");
        }
        setAvailable(false);
    }

    @Override
    public void returnVehicle() {
        setAvailable(true);
        System.out.println("Car returned successfully");
    }
}
