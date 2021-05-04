public class Bank {
    int bankId;
    String bankName;
    String bankCity;
    int noOfCustomers;

    public Bank(){
     this(100);

    }
    public Bank(int bankId){
        this(bankId,"SBI");

    }
    public Bank(int bankId, String bankName){
        this(bankId, bankName,"mumbai");
    }
    public Bank(int bankId, String bankName, String bankCity){
        this(bankId, bankName , bankCity, 10000);
    }


    public Bank(int bankId, String bankName, String bankCity, int noOfCustomers){
        this.bankId=bankId;
        this.bankName=bankName;
        this.bankCity=bankCity;
        this.noOfCustomers=noOfCustomers;
    }

    public String getBankDetails(){
        return "ID: "+bankId+"Name: "+bankName+"city: "+bankCity+"No of customers = "+noOfCustomers;

    }
}
