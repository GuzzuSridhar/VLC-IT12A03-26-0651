package Strings;

public class StringFormatSpecifiers {
public static void main(String[] args) {
    // %s - String
    // %d - Integer
    // %f - Floating-point number
    // %n - New line
    // %.2f - Floating-point number with 2 decimal places
    // %x - Hexadecimal integer
    // %o - Octal integer
    // %e - Scientific notation
    // %c - Character
    // %b - Boolean
    // %20s - String with a minimum width of 20 characters (right-aligned)
    // %-20s - String with a minimum width of 20 characters (left-aligned)

    //column headers with all types of format specifiers
    System.out.printf("%-20s %-10s %-10s %-10s%n", "Name", "Age", "Salary", "Is Employee");
    System.out.printf("%-20s %-10d %-10.2f %-10b%n", "Alice", 42, 3.14159, true);   
    System.out.printf("%-20s %-10d %-10.2f %-10b%n", "Bob", 25, 2.71828, false );   


    



    // int num = 42;
    // double pi = 3.14159;
    // String name = "Alice";

    // // Using format specifiers
    // System.out.printf("Integer: %d%n", num); // Output: Integer: 42
    // System.out.printf("Floating-point: %.2f%n", pi); // Output: Floating-point: 3.14
    // System.out.printf("String: %s%n", name); // Output: String: Alice

    // // Combining multiple specifiers
    // System.out.printf("Name: %s, Age: %d, Pi: %.2f%n", name, num, pi); // Output: Name: Alice, Age: 42, Pi: 3.14
}
}
