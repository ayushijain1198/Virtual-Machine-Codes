package comm.demo;
import comm.example.Parent;
import comm.example.Child1;
import comm.example.Child2;

public class Tester {

    public static void main(String args[]) {
        Child1 t = new Child1();
        t.message();
        Child2 r = new Child2();
        r.message();
    }
}
