package Strings;

public class SringImmute {
    public static void main(String[] args) {
        String s3 = "Hello";
        System.out.println(s3.hashCode()); // Output: hash code of "Hello"
        s3 += " World";
        System.out.println(s3.hashCode()); // Output: hash code of "Hello"
        System.out.println(s3); // Output: Hello World
      




        //  after every change to the value of a string, a new string object is created in memory. The original string remains unchanged, and any reference to it will still point to the original string.

        // String s1 = "Hello";
        // String s2 = "Hello";
        // String s3 = new String("Hello");
        // System.out.println(s1 == s2); // Output: true (both refer to the same string literal)
        // System.out.println(s1 == s3); // Output: false (s3 is a new object)
        // System.out.println(s1.equals(s3)); // Output: true (content is the same)


    }
}
