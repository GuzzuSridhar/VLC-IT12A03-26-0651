package exercises;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String in = input.next(), testPal="";


        // capture reverse of String
        for (int i = in.length() - 1; i >= 0; i--) {
            testPal += in.charAt(i);
        }

        // System.out.println(testPal);

        boolean isGood = in.equalsIgnoreCase(testPal); 
        if(isGood)
            System.out.println(in + " is a palindrome");
        else
            System.out.println(in + " is not a palindrome");
        input.close();
    }
}
