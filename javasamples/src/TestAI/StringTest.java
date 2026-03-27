package TestAI;

public class StringTest {
// vowels in a String   
    public static void main(String[] args) {
        // scanner input
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String str = "Hello World";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }
        System.out.println("Number of vowels in the string: " + count);
    }

    //prime number checker
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    //string formatting
    public static String formatString(String str) {
        // removes leading and trailing whitespace and converts to lowercase        
        String formattedStr = formatString("   Hello World   ");
        System.out.println("Formatted String: '" + formattedStr + "'"); 
        return str.trim().toLowerCase();


    }
}
