package exercises;

import java.util.Scanner;

public class ReverseOfString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String in = input.next();

        System.out.print("Reverse of " + in + " is "  );
        // print reverse of String
        for (int i = in.length()-1; i >=0; i--) {
            System.out.print(in.charAt(i));
        }
        
        input.close();

        
    }
}
