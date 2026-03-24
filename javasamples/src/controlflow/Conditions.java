package controlflow;

import java.util.Scanner;

public class Conditions {

              public static void main(String[] args) {
          //  using the user input
         Scanner input = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        int sal = input.nextInt();
        if (sal > 1000 && sal < 2000) {
            sal += 100;
            System.out.println("you salary is : " + sal);
        } else if (sal >= 2000) {
            sal += 200;
            System.out.println("you salary is : " + sal);
        } else {
            System.out.println("Else executed");
        }
        input.close();

        // ----------------------------------------
        boolean b = true;
        if (!b) {
            System.out.println("something");
        } else {
            System.out.println("Nothing");
        }
        input.close();
    }
}

