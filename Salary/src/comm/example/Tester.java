package comm.example;

public class Tester {
    public static void main(String args[]){
        Employee employee1 = new Employee("Ayushi","Jain","ayushi@email.com",10000);
        Employee employee2 = new Employee("John", "Smith","john@email.com",20000);
        System.out.print((employee1==employee2)+"\n");
        System.out.println(employee1.equals(employee2));
    }
}