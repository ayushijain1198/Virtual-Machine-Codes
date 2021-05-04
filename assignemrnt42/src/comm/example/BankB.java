package comm.example;

public class BankB extends Bank{
    @Override
    public double getBalance() {
        System.out.println("$150 is deposited");
        return 0;
    }
}
