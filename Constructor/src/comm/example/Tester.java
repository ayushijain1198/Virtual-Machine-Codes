package comm.example;

public class Tester {
    public static void main(String args[]){
        Employee employee=null;
        employee= new Manager("John smith","sales");
        System.out.println(employee.displayDetails());
    }
}
