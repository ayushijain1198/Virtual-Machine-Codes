package comm.test;
import comm.example.MyService;
import comm.example.MyServiceImpl;

public class Tester {
    public static void main(String args[]){
        MyService myService = new MyServiceImpl();
        myService.a();
        System.out.println(MyService.MAX);
    }
}