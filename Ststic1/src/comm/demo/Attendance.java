package comm.demo;

import comm.example.Day;

public class Attendance {
    private Day day;
    private String name;
    private boolean isPresent;

    public Attendance(Day day, String name, boolean isPresent) {
        this.day = day;
        this.name = name;
        this.isPresent = isPresent;
    }

    public String getAttendance(){
        String str=null;
        if(isPresent==true){
            str="Present";
        }
        if(isPresent==false){
            str="Absent";
        }
        return str;
    }

    @Override
    public String toString() {
        return "name of employee is : "+ name + "Day is : " + day.getDay() +" Attendance Ststus: "+getAttendance();
    }
}
