package exceptions;

public class ZeroDivision {
    public static void main(String[] args) {
        int x = 10, y =0;
        try{
        System.out.println(x/y);
        }catch(ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
        System.out.println("Welcome to Exception");
    }

}
