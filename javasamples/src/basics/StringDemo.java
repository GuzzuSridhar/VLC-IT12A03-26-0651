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
    }

}
