public class Customer {
    int custId;
    String custDept;
    boolean isCompleted;
    public Customer(){

    }
    public Customer(int custId, String custDept, boolean isCompleted){
        this.custId=custId ;
        this.custDept=custDept ;
        this.isCompleted= isCompleted;
    }
    public String getDetails(){
        return "Customer Id: "+custId+" Customer department: "+custDept+" Completed? "+isCompleted;

    }
}

