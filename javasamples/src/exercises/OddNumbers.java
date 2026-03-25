package exercises;

public class OddNumbers {
    public static void main(String[] args) {
        System.out.println("Odd numbers between 1 and 100:");

        // Start at 1, stay below or equal to 100
        // i += 2 is shorthand for i = i + 2
        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
    }
}
