package ClassesAndObjects.books;

public class Book {
    // intance variables or fields  or state 
    // for a library names "My Library"
    String title;
    String author;
    int yop;
    String genre;
    int pageCount;
    static int bookCount;
    static String libName = "My Library";
}


//Static members are shared across all instances / objects of a class
// Instance variables belong to Individual objects
// Static variables can be used to keep track of class-wide information
// static members can be accessed via the class name or the instance name
