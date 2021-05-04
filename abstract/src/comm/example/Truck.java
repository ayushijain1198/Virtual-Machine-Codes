package comm.example;

public class Truck extends Vehicle{
private double maxLoad;

    public Truck(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    @Override
    public double calculateFuelEfficiency() {
        System.out.println("fuel in truck");
        return 0;
    }

    @Override
    public double calculateTripDistance() {
        System.out.println("trip in truck");
        return 0;
    }

    @Override
    public void display() {
        super.display();
    }
}
