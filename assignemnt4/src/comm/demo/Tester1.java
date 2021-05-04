package comm.demo;
import comm.example.Parent1;
import comm.example.Class1;
import comm.example.Class2;

public class Tester1 {
    public static void main(String args[]){
        Parent1 Class1 = new Class1();
        Class1.message();
        Parent1 Class2 = new Class2();
        Class2.message();
    }
}
