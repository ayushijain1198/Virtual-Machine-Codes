package comm.example;

public class Motorcycle extends RoadVehicle {
    private String acceleratorType;

    public Motorcycle(String acceleratorType) {
        this.acceleratorType= acceleratorType;

    }

    @Override
    public void setEmployeeDetails(int numPassengers, int numWheels, String make, String model) {
        super.setEmployeeDetails(numPassengers, numWheels, make, model);
    }

    @Override
    public void getEmployeeDetails() {
        super.getEmployeeDetails();
        System.out.println("Accelerator Type is: " + acceleratorType);
    }
    public void display () {
        System.out.println("hello");
    }
}
