package comm.example;

public class CounterTest {

    public static void main(String args[]){
        System.out.println("number of counter is "+Counter2.getTotalCount());
        Counter2 counter = new Counter2();
        System.out.println("Number of counter is "+Counter2.getTotalCount());
    }
}
