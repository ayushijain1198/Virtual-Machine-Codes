package comm.example;

public class RoadVehicle {
    private int numPassengers;
    private int numWheels;
    private String make;
    private String model;

    public void setEmployeeDetails(int numPassengers, int numWheels, String make, String model){
        this.numPassengers=numPassengers;
        this.numWheels=numWheels;
        this.make=make;
        this.model=model;
    }

    public void getEmployeeDetails(){
        System.out.printf("%s,%s,%s,%s",numPassengers,numWheels,make,model);

    }

}
