package comm.example;

public class BankBi implements Bank1{
    @Override
    public void getBalance() {
        System.out.println("$150 is deposited");
    }
}
