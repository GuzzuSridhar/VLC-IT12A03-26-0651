package exercises;

import java.util.Scanner;

public class VowelCountWithReplace {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String original = input.nextLine();

        // 1. Store the original length
        int startLength = original.length();

        /* * 2. We chain the .replace() method. 
         * Each call takes the result of the previous one and removes 
         * one specific vowel (both lowercase and uppercase).
         */
        String modified = original.replace("a", "")
                                  .replace("e", "")
                                  .replace("i", "")
                                  .replace("o", "")
                                  .replace("u", "")
                                  .replace("A", "")
                                  .replace("E", "")
                                  .replace("I", "")
                                  .replace("O", "")
                                  .replace("U", "");

        // 3. The difference in length tells us the total count
        int vowelCount = startLength - modified.length();

        System.out.println("Original: " + original);
        System.out.println("Result:   " + modified);
        System.out.println("Count:    " + vowelCount);

        input.close();
    }
}
