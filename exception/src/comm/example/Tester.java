package comm.example;

import java.util.Scanner;
import java.util.UUID;

public class Tester {
    private static  Scanner scanner = new Scanner(System.in);
    {

    }

    public static void main(String args[]){
        int size =0;
        Person[] personList=null;
        System.out.print("enter the length of array");
        size = scanner.nextInt();
        personList = new Person[size];

        Tester t1=new Tester();
        for(int i=0;i<=personList.length;i++){
            System.out.println("enter fist name= ");
            String fname=scanner.next();
            System.out.println("enter last  name= ");
            String lname=scanner.next();
            System.out.println("enteremail= ");
            String email=scanner.next();

            try{
                personList[i]=new Person(UUID.randomUUID().toString(),fname,lname,email);
                System.out.println(personList[i].displayDetails());
            }
            catch(ArrayIndexOutOfBoundsException aeobe){
                System.out.println("array index out of bound");
                aeobe.printStackTrace();
            }
            finally{
                System.out.println("i'm at finally");
            }
        }

    }
}
