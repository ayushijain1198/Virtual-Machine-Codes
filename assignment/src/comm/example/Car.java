package comm.example;

public class Car extends RoadVehicle{

        private String acceleratorType;

        public Car(String acceleratorType) {
            this.acceleratorType= acceleratorType;

        }
     public Car(){

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



