package comm.example;

public class BankCi implements Bank1 {
    @Override
    public void getBalance() {
        System.out.println("$200 is deposited");
    }
}
