package exercises;

public class FibonacciSeries {
    public static void main(String[] args) {
        int limit = 100; // The maximum value we don't want to exceed
        int firstNum = 0;
        int secondNum = 1;

        System.out.println("Fibonacci Series up to " + limit + ":");

        // We use a while loop because we don't know exactly how many iterations
        // it will take to reach 100.
        while (firstNum <= limit) {
            // Print the current number in the sequence
            System.out.print(firstNum + ", ");

            // Logic to calculate the next number:
            // 1. Store the sum of the two previous numbers
            int nextNum = firstNum + secondNum;

            // 2. Shift the values: the 'second' becomes the 'first'
            firstNum = secondNum;

            // 3. The 'sum' we just calculated becomes the new 'second'
            secondNum = nextNum;
        }
    }
}
