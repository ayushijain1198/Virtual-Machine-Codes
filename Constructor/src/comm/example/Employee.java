package comm.example;

import sun.management.snmp.jvmmib.EnumJvmMemPoolCollectThreshdSupport;

import java.util.Date;

public class Employee extends Object{
    private String name;
    private double salary=15000.00;
    private Date birthDate;

    public Employee(){

    }
    public Employee(String n, Date dob){
        //implicit super();
        name=n;
        birthDate=dob;
    }

    public Employee(String n){
        this(n,null);
    }

    public String displayDetails(){
        return "name: "+name+"salary: "+salary+"DOB; "+birthDate;
    }


}
