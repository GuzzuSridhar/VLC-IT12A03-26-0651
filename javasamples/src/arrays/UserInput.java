package arrays;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String names[] = new String[3];
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter Employee Name: ");
            names[i]= scan.nextLine();
        }
        scan.close();

        for (String string : names) {
            System.out.println(string);
        }

    }
}
