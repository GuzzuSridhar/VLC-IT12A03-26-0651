package exercises;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to check if it is prime: ");
        int num = input.nextInt();

        // A boolean 'flag' to keep track of our finding
        boolean isPrime = true;

        // Step 1: Handle edge cases. Numbers less than 2 are not prime.
        if (num <= 1) {
            isPrime = false;
        } else {
            /*
             * * Step 2: Check for divisors.
             * We start from 2 and go up to the square root of num.
             * Why square root? Because if a factor exists, one must be
             * less than or equal to the square root. It makes the code faster!
             */
            for (int i = 2; i <= Math.sqrt(num); i++) {
                // The % (modulo) operator gives the remainder of a division.
                // If remainder is 0, it means 'i' is a factor of 'num'.
                if (num % i == 0) {
                    isPrime = false; // We found a divisor, so it's not prime
                    break; // No need to keep checking, exit the loop
                }
            }
        }

        // Step 3: Output the result based on our boolean flag
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        input.close();
    }
}
