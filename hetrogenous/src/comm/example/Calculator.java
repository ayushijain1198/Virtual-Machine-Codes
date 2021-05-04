package comm.example;

public class Calculator {
    /*public void add(){
        System.out.println("blank add");
    }
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public void add(String a, String b){
        System.out.println(a+b);
    }*/

    public void add(int... a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        System.out.println("Result is: "+sum);
    }
}
