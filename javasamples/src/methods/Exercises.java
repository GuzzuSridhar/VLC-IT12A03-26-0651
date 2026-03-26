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

    static int vowelCount(String str){
        // String newStr = str.
        //     toLowerCase()
        //     .replace("a", "")
        //     .replace("e","")
        //     .replace("i","")
        //     .replace("o","")
        //     .replace("u","");
        // return str.length() - newStr.length();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.toLowerCase().charAt(i)=='a' || 
            str.toLowerCase().charAt(i)=='e' ||
            str.toLowerCase().charAt(i)=='i' || 
            str.toLowerCase().charAt(i)=='o'|| 
            str.toLowerCase().charAt(i)=='u'){
                    count++;
            }
        }
        return count;
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

        p.P.p("There are " + Exercises.vowelCount(in) + " Vowels in " + in  );

        scan.close();
    }
}
