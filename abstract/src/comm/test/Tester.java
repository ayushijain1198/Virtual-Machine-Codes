package comm.test;

import comm.example.RiverBarge;
import comm.example.Truck;
import comm.example.Vehicle;

public class Tester {
    public static void main(String args[]) {
        Truck t = new Truck(500);
        t.display();
        t.calculateFuelEfficiency();
        t.calculateTripDistance();
        RiverBarge r = new RiverBarge();
        r.display();
        r.calculateFuelEfficiency();
        r.calculateTripDistance();
    }

}
