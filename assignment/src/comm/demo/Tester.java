package comm.demo;

import comm.example.RoadVehicle;
import comm.example.Motorcycle;
import comm.example.Car;
import comm.example.Coupe;
import comm.example.Roadster;

public class Tester extends RoadVehicle {


        public static void main(String args[]){
            RoadVehicle roadVehicles[]= new RoadVehicle[5];
            RoadVehicle roadVehicle=new RoadVehicle();
            roadVehicle.setEmployeeDetails(5 ,4 ,"Honda ","City  ");
            Motorcycle motorcycle = new Motorcycle("Automatic");
            motorcycle.setEmployeeDetails(2 ,2 ,"Suzuki","Access");
            Car car=new Car("manual");
            car.setEmployeeDetails(7 ,4 ,"Maruti","Ertiga");
            Coupe coupe3 =  new Coupe("Packed roof");
            coupe3.setEmployeeDetails(5,4,"Audi","Q3");
            Roadster roadster4 = new Roadster("open roof");
            roadster4.setEmployeeDetails(2,4,"BMW","A1");
            roadVehicles[0]=roadVehicle;
            roadVehicles[1]=motorcycle;
            roadVehicles[2]=car;
            roadVehicles[3]=coupe3;
            roadVehicles[4]=roadster4;
            for (int i=0;i<roadVehicles.length;i++){
                roadVehicles[i].getEmployeeDetails();
            }
        }

    }
