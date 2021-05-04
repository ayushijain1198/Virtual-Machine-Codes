package comm.example;

import java.util.Date;

public class CD {
    private int CDid;
    private String cdName;
    private String dateOfRelease;

    public CD(){

    }
    public CD(int id, String n, String dor){
        //implicit super();
        this.CDid=id;
        this.cdName=n;
        this.dateOfRelease=dor;
    }

    public void createNewCD(int id, String n, String dor){
        this.CDid=id;
        this.cdName=n;
        this.dateOfRelease=dor;
    }


    public String displayDetails(){
        //return "ID: "+CDid+"name: "+cdName+"DOR; "+dateOfRelease;
        System.out.printf("%d,%s,%s\n ",CDid,cdName,dateOfRelease);
        return null;
    }
}
