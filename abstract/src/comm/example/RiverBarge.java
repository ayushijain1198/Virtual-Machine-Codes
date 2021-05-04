package comm.example;

public class RiverBarge extends Vehicle{
    @Override
    public double calculateFuelEfficiency() {
        System.out.println("fuel");
        return 0;
    }

    @Override
    public double calculateTripDistance() {
        System.out.println("trip");
        return 0;
    }

    @Override
    public void display() {
        super.display();
    }
}
