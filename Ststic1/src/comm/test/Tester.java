package comm.test;

import comm.demo.Attendance;
import static comm.example.Day.*;
import static java.lang.System.out;

public class Tester {
    public static void main(String args[]){
        Attendance attendance=new Attendance(MONDAY,"john",true);
        out.println(attendance);
        Attendance attendance1=new Attendance(SUNDAY,"marry",false);
        out.println(attendance1);
    }
}
