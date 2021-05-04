package comm.example;

public class Bank {
    private int balance;
    private int amount;
    private int newBal;

    public Bank(int balance, int amount, int newBal) {
        this.balance = balance;
        this.amount = amount;
        this.newBal= newBal;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String Deposite() throws Exception{
        if(getAmount()<1000){
            throw new Exception("Minimum Deposit amount is 1000");
        }
        newBal = balance+amount;
        return "Balance is = "+newBal;
    }

    public String Withdrawl() throws Exception{
        if(getBalance()<1000){
            throw new Exception("Minimum balance should be 1000. You cannot withdraw");
        }
        newBal = balance-amount;
        return "Balance is = "+newBal;

    }
}
