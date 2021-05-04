package comm.example;

import java.util.Scanner;

public class Tester {
    private static Scanner scanner = new Scanner(System.in);
    {

    }

    public static void main(String args[]){
        Bank bank=new Bank();
        int amt;
        String mode;


        System.out.print("enter amount= ");
        amt = scanner.nextInt();
        System.out.println("Enter mode = ");
         mode = scanner.next();

         if(mode == "deposit"){
             try{
                 System.out.println(bank.Deposite());
             }
             catch(){

         }




    }
}
