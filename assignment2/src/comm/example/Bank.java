package comm.example;

import java.util.Random;

public class Bank {
    private final double RateOfInterest=3.2;
    private double totalAmount=10000;
    private int customerId;
    private double finalTotalAmount;

    public Bank(){
        customerId=createCustomerID();
        totalAmount=getTotalAmount();
        finalTotalAmount= getTotalAmount();
    }

    public double getTotalAmount() {
        System.out.println(totalAmount);
        return finalTotalAmount = totalAmount*RateOfInterest;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    private int createCustomerID(){
        return new Random().nextInt(1000);
    }

    @Override
    public String toString() {
        System.out.println("Total Amount before interest: ");
        System.out.println("Customer Id is: "+customerId+" Total amount = "+totalAmount );
        System.out.println("Total Amount After interest: ");
        return "Customer Id is: "+customerId+" Interest rate is: "+RateOfInterest+" Total amount = "+finalTotalAmount;

    }

    public static void main(String args[]){
            Bank bank = new Bank();
            System.out.print(bank);
    }
}

