package basics;

public class Operators {
    public static void main(String[] args) {
        // int x = 10;
        // int y = 20;
        // declare multiple variables on one line
        int x = 10, y = 20; // all variables should be of same type
        // int x = 10, y = "20"; // Not allowed

        System.out.println("x before assignment operator usage is: "+x);
        System.out.println( "y before assignment operator usage is: "+y);
        
        // Assignment operators
        //  equals (=)
        x = 30; // equals operator
        y = 40;
        System.out.println("x after assignment operator usage is: "+x);
        System.out.println( "y after assignment operator usage is: "+y);
        
        x += 10;
        System.out.println( "x after plus equals operator usage is: "+x);
        x -= 10;
        System.out.println( "x after minus equals operator usage is: "+x);
        x *= 10;
        System.out.println( "x after multiply equals operator usage is: "+x);
        x /= 10;
        System.out.println( "x after divide equals operator usage is: "+x);
        x %= 10;
        System.out.println( "x after modulo equals operator usage is: "+x);
        
        // Arithmetic operators
        // Comparison operators
        // logical operators
    }

}
