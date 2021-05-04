package comm.example;

public class BankC extends Bank {
    @Override
    public double getBalance() {
        System.out.println("$200 is deposited");
        return 0;
    }
}
