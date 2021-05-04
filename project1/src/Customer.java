public class Customer{
    int customerId;
    String customerName;
    double customerAmount;

    public Customer(){
this(10);
    }
    public Customer(int customerId){
        this(customerId, "john");

    }
    public Customer(int customerId, String customerName){
        this(customerId,customerName,20000);
    }

    public Customer(int customerId, String customerName, double customerAmount){
        this.customerId=customerId;
        this.customerName=customerName;
        this.customerAmount=customerAmount;
    }
    public String getCustomerDetails(){
        return "ID: "+customerId+"Name: "+customerName+"Amount: "+customerAmount;

    }
}
