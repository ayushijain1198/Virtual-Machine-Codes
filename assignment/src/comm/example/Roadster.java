package comm.example;

public class Roadster extends Car{
    private String coolFactor;
    public Roadster(String coolFactor) {
        this.coolFactor= coolFactor;

    }

    @Override
    public void setEmployeeDetails(int numPassengers, int numWheels, String make, String model) {
        super.setEmployeeDetails(numPassengers, numWheels, make, model);
    }
    @Override
    public void getEmployeeDetails() {
        super.getEmployeeDetails();
        System.out.print("the cool factor is: "+coolFactor);
    }

    @Override
    public void display() {
        super.display();
    }
}
