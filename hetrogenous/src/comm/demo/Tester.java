package comm.demo;

import comm.example.*;


public class Tester extends Employee{

    public static void main(String args[]){
       /* Employee employees[]= new Employee[3];
        Employee employee=new Employee();
        employee.setEmployeeDetails("emp2","marry","public","marry@email.com");
        Manager manager1 = new Manager("sales");
        manager1.setEmployeeDetails("emp1","john","doe","john@email.com");
        Engineer engineer2=new Engineer("SE");
        engineer2.setEmployeeDetails("emp5","Ram","mohan","ram@email.com");
        employees[0]=employee;
        employees[1]=manager1;
        employees[2]=engineer2;
        for (int i=0;i<employees.length;i++){
            employees[i].getEmployeeDetails();
        }*/

       /* Calculator c=new Calculator();
        c.add();
        c.add(10,20);
        c.add(100,200,300);
        c.add(2,3,4,5,6,7);*/


        Manager manager= new Manager("sales");
        manager.setEmployeeDetails("e1","john","doe","j@email.com");
        Engineer engineer=new Engineer("SE");
        engineer.setEmployeeDetails("e2","marry","public","marry@email.com");
        TaxService taxService=new TaxService();
        taxService.calculateTax(manager);
        taxService.calculateTax(engineer);
    }

}
