package basics;

import java.util.Scanner;

public class UserInput {
public static void main(String[] args) {
    Scanner scan  = new Scanner(System.in); // obtain scanner object
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
        scan.close();
}
}
