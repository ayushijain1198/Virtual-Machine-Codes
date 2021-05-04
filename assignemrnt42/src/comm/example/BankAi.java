package comm.example;

public class BankAi implements Bank1 {
    @Override
    public void getBalance() {
        System.out.println("$100 us deposited");
    }
}
