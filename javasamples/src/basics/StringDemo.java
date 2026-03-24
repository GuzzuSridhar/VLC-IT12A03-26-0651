package basics;

public class StringDemo {
    public static void main(String[] args) {
        // String type (String is a class in java API)
        // creation of a String (2 ways of creation)
        String name = new String("John"); // using the new keyword
        String city = "Singapore"; // String literal
        
        // String is a sequence of characters
        // escape sequences can be used

        String bio = "This is my John's bio";
        System.out.println(bio);
        System.out.println("this is a double quote \" "); // escape character \"
        System.out.println("this is a back slash \\"); // escape character \\
        System.out.println("this is a new line character \n this is in the second line");

        // String methods
        String greet = "Hello";
        // length of a String (# characters)
        System.out.println(greet.length());
        // concatenation (+)
        System.out.println("The String \""+ greet + "\" has " + greet.length()+ " characters");

        // Strings are indexed (zero based) (Character arrays)
        System.out.println(greet.charAt(0));
        System.out.println(greet.charAt(1));
        System.out.println(greet.charAt(2));
        System.out.println(greet.charAt(3));
        System.out.println(greet.charAt(4));
        // accessing an index that is not present will result in a runtime error (Exception)
        // System.out.println(greet.charAt(5)); // will result in an error

        // case conversion
        System.out.println(greet.toLowerCase());
        System.out.println(greet.toUpperCase());

        // substring
        System.out.println(greet.substring(0, 4)); // end index excluded

        // equality check
        String s1 = "Hello";
        String s2 = "hello";
        String s3 = new String("Hello");

        // case sensitive comparision
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s3));
        System.out.println(s2.equals(s1));
        // case insensitive comparision
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s2.equalsIgnoreCase(s3));
        System.out.println(s2.equalsIgnoreCase(s1));




    }

}
