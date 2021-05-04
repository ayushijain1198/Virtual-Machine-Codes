package comm.example;

public class BankA extends Bank{
    @Override
    public double getBalance() {
        System.out.println("$100 us deposited");
        return 0;
    }
}
