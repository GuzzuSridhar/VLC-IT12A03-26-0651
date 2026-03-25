package ClassesAndObjects.books;

public class Library {
    public static void main(String[] args) {
        // create book objects
        Book b001 = new Book(); // book object
        Book b002 = new Book();
        Book b003 = new Book();

        // appending the data of book1
        b001.title = "Java Fundamentals";
        b001.author = "John";
        b001.yop = 2001;
        b001.genre = "Programming";
        b001.pageCount = 298;

        // printing information of a book
        System.out.println("Title:" + b001.title);
        System.out.println("Author:" +b001.author);
        System.out.println("Year of Publish:" +b001.yop);
        System.out.println("Genre:" +b001.genre);
        System.out.println("Page Count:" +b001.pageCount);

        System.out.println("--------------------------------");
        
        // appending the data of book2
        b002.title = "Python Fundamentals";
        b002.author = "Alex";
        b002.yop = 2003;
        b002.genre = "Programming";
        b002.pageCount = 398;
        // printing information of a book 2
        System.out.println("Title:" + b002.title);
        System.out.println("Author:" +b002.author);
        System.out.println("Year of Publish:" +b002.yop);
        System.out.println("Genre:" +b002.genre);
        System.out.println("Page Count:" +b002.pageCount);
        System.out.println("--------------------------------");
        // appending the data of book 3
        b003.title = "HTML Fundamentals";
        b003.author = "Bill";
        b003.yop = 2000;
        b003.genre = "Programming";
        b003.pageCount = 198;
        // printing information of a book 3
        System.out.println("Title:" + b003.title);
        System.out.println("Author:" +b003.author);
        System.out.println("Year of Publish:" +b003.yop);
        System.out.println("Genre:" +b003.genre);
        System.out.println("Page Count:" +b003.pageCount);
        System.out.println("--------------------------------");
    }
}
