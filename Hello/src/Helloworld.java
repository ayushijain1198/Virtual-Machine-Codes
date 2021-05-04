public class Helloworld {
    public static void main(String args[])
    { Customer customer=null;
    customer=new Customer();
    customer.setDetails(1 ,"john ",10000);
    System.out.println(customer.getDetails());
   customer.deposit(10000);
   System.out.println(customer.getDetails());
   System.out.println(customer.withdrawl(30000));
        System.out.println(customer.getDetails());
    }
}
