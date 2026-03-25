package exercises;

public class EvenNumbers {
    public static void main(String[] args) {
        System.out.println("Odd numbers between 1 and 100:");

        // Start at 2, stay below or equal to 100
        // i += 2 is shorthand for i = i + 2
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }

        /* Alternate method of code to print even numbers

        // Step 1: Start a loop from 1 to 100
        for (int i = 1; i <= 100; i++) {
            
            // Step 2: Check if the current number 'i' is even
            // The % operator returns the remainder of the division
            if (i % 2 == 0) {
                // Step 3: If even, print it followed by a space
                System.out.print(i + " ");
            }
        }
        
        */
    }
}
