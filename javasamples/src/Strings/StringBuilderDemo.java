package Strings;

public class StringBuilderDemo {
public static void main(String[] args) {
    StringBuilder sb1 = new StringBuilder("Hello");
    System.out.println(sb1.hashCode()); // Output: hash code of the StringBuilder object
    sb1.append(" World");
    System.out.println(sb1.hashCode()); // Output: same hash code as before (StringBuilder is mutable)
    System.out.println(sb1.toString()); // Output: Hello World

    // StringBuilder allows you to modify the content without creating a new object, which can be more efficient for certain operations compared to using immutable strings.
    
    //StringBuilder Methods demo
    StringBuilder sb = new StringBuilder("Hello");   
    sb.append(" World"); // Appends " World" to the existing string
    sb.insert(5, ","); // Inserts a comma at index 5
    sb.replace(0, 5, "Hi"); // Replaces "Hello" with "Hi"
    sb.delete(2, 5); // Deletes characters from index 2 to 4
    sb.reverse(); // Reverses the string
    System.out.println(sb.toString()); // Output: dlroW ,iH
}
}
