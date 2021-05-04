public class Hey {
    public static void main(String args[])
    { Bank bank=null;
        bank=new Bank();
        bank.setBankDetails(101, "SBI", "Mumbai", 100);;
        System.out.println(bank.getBankDetails());

    }
}
