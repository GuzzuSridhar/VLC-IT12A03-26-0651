package exercises;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer to reverse: ");
        int num = input.nextInt();

        int reversed = 0;

        // We keep looping until the original number becomes 0
        while (num != 0) {
            // 1. Get the last digit of the number
            int digit = num % 10;

            /*
             * 2. Build the reversed number.
             * We multiply the current 'reversed' by 10 to shift digits left,
             * then add the new digit.
             */
            reversed = reversed * 10 + digit;

            // 3. Remove the last digit from the original number
            num = num / 10;
        }

        System.out.println("Reversed Number: " + reversed);

        input.close();
    }
}
