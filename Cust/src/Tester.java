public class Tester {
    Customer customers[];
    public Tester(){
        customers=new Customer[6];
    }
    public static void main(String args[]){
        Tester tester = new Tester();
        for(int i=1;i<6;i++){
            tester.customers[i]= new Customer(i,"sales",false);

        }
        for(int i=1;i<6;i++){
            System.out.println(tester.customers[i].getDetails());

        }
    }
}
