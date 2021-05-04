public class Bank {
    int bankId;
    String bankName;
    String bankCity;
    int noOfCustomers;

    public String getBankDetails() {
        return "Bank ID: " + bankId + "Bank Name: " + bankName + "bank city: " + bankCity + "No. of customers = " + noOfCustomers;
    }
    public void setBankDetails(int id, String name,String name1, int count){
        bankId=id;
        bankName=name;
        bankCity=name1;
        noOfCustomers=count;
    }
}
