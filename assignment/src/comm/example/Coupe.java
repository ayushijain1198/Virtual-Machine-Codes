package comm.example;

public class Coupe extends Car{
    private String boringFactor;

    public Coupe(String boringFactor) {
        this.boringFactor= boringFactor;

    }

    @Override
    public void setEmployeeDetails(int numPassengers, int numWheels, String make, String model) {
        super.setEmployeeDetails(numPassengers, numWheels, make, model);
    }

    @Override
    public void getEmployeeDetails() {
        super.getEmployeeDetails();
        System.out.print("the boring factor is: "+boringFactor);
    }

    @Override
    public void display() {
        super.display();
    }
}
