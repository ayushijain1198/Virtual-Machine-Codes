package comm.example;

import comm.example.CD;
import comm.example.SpecialEditionCD;
import comm.example.InternationalCD;

public class Tester extends CD {
    public static void main(String args[]) {
        CD cds[] = new CD[5];
        CD cd = new CD();
        cd.createNewCD(101,"Avengers","March 2013");
        SpecialEditionCD specialEditionCD = new SpecialEditionCD("3D");
        specialEditionCD.createNewCD(102,"Final Destination","Dec 2010");
        SpecialEditionCD specialEditionCD1 = new SpecialEditionCD("Dollby");
        specialEditionCD1.createNewCD(103,"Thor","Jan 2015");
        InternationalCD internationalCD=new InternationalCD("English");
        internationalCD.createNewCD(104,"Notebook","May 2014");
        InternationalCD internationalCD1=new InternationalCD("Korean");
        internationalCD1.createNewCD(105,"Parasite","Aug 2019");

        cds[0]=cd;
        cds[1]=specialEditionCD;
        cds[2]=specialEditionCD1;
        cds[3]=internationalCD;
        cds[4]=internationalCD1;

        for (int i=0;i<cds.length;i++){
            cds[i].displayDetails();
        }

    }

}
