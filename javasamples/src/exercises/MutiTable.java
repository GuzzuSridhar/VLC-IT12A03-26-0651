package exercises;

import java.util.Scanner;

public class MutiTable {
    public static void main(String[] args) {
        // Create a Scanner object to handle input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to see its multiplication table: ");

        // Read the integer entered by the user
        int num = input.nextInt();

        System.out.println("--- Multiplication Table for " + num + " ---");

        /*
         * * We use a 'for' loop to iterate from 1 to 10.
         * i++ means 'i' increases by 1 after every loop cycle.
         */
        for (int i = 1; i <= 10; i++) {
            // Calculate the product
            int product = num * i;

            // Print the result in a readable format (e.g., 5 x 1 = 5)
            System.out.println(num + " x " + i + " = " + product);
        }

        // Good practice: close the scanner to free up system resources
        input.close();
    }
}
