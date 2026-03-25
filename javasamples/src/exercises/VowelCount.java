package exercises;

import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string/sentence: ");
        // .nextLine() reads the whole sentence, including spaces
        String str = input.nextLine();

        // Convert the string to lowercase so we don't have to check
        // for both 'A' and 'a' separately.
        str = str.toLowerCase();

        int vowelCount = 0;

        // Loop through the string from index 0 to the end
        for (int i = 0; i < str.length(); i++) {
            // Get the character at the current position 'i'
            char ch = str.charAt(i);

            // Check if the character is one of the five vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++; // Increment the counter if a vowel is found
            }
        }

        System.out.println("Total number of vowels: " + vowelCount);

        input.close();
    }
}
