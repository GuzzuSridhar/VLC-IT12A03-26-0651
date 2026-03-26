package methods;

import java.util.Scanner;

public class Exercises {
   static String reverseOfString(String input){
        String revStr = "";
        for (int i = input.length()-1; i >=0 ; i--) {
            revStr += input.charAt(i);
        }
        return revStr + " is the reverse of " + input;

    }

    static boolean isPalindrome(String input){
        // if(Exercises.reverseOfString(input).equalsIgnoreCase(input)){
        //     return true;
        // }
        // else{
        //     return false;
        // }

        return Exercises.reverseOfString(input).equalsIgnoreCase(input) ? true : false;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String in = scan.nextLine();

        // Exercises e = new Exercises();
        // System.out.println(Exercises.reverseOfString(in));
        p.P.p(Exercises.reverseOfString(in));
        // System.out.println((Exercises.isPalindrome(in)) ? in + " is a Palindrome" : in + " is not a palindrome" );
        p.P.p((Exercises.isPalindrome(in)) ? in + " is a Palindrome" : in + " is not a palindrome" );
        
        // if(Exercises.isPalindrome(in)){
        //     System.out.println(in + " is a Palindrome");
        // }else{
        //     System.out.println(in + " is not a palindrome");
        // }

    

        scan.close();
    }
}
