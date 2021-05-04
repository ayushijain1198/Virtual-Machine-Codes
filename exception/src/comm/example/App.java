package comm.example;

public class App {
    public static void main(String args[]){
        Calculator calculator = new Calculator(200,0);

        try{
            System.out.println(calculator.divide());
        }
        catch(ArithmeticException a){
            System.out.println(a.toString());
            System.err.println("cannot divide by 0 check your code");
        }
        catch(NumberFormatException ae){
            ae.printStackTrace();
            System.out.println(ae.toString());
            System.err.println("cannot divide by 0 check your code");
        }

    }
}
