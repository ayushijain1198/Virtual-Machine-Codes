package comm.example;

public class Tester1 {
    public static void main(String args[]){
        Employee employee = new Employee(1,"john11","doe22");
        try{
            System.out.println(employee.getFullName());

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
