public class Customer {

    int customerId;
    String customerName;
    double customerAmount;

    public String getDetails(){
        return "Customer ID: "+customerId+"Customer Name: "+customerName+"Customer Amount: "+customerAmount;
    }
    public void setDetails(int id, String name, double amount){
        customerId=id;
        customerName=name;
        customerAmount=amount;
    }
    public void deposit(double amount){
        customerAmount=customerAmount+amount;
            System.out.println("amount deposited, current balance is: " + customerAmount);

    }

    public String withdrawl(double amount) {
        customerAmount = customerAmount - amount;
        if (customerAmount <= 0) {
            return"Insufficient balance";
        } else {
            return "your current balance is: " + customerAmount;
        }

    }
}
