package comm.example;

public enum Day {
    SUNDAY("Day ia Sunday"),
    MONDAY("Day is monday"),
    TUESDAY("day is tuesday"),
            THRUSDAY("day is thrusday"),
    FRIDAY("day is friday"),
                    SATURDAY("day is saturday");

    private final String day;

    private Day(String day){
        this.day = day;
    }
    public String getDay(){
        return day;
    }
}
