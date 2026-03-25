package ClassesAndObjects.books;

import java.util.Arrays;

public class BookArray {
    public static void main(String[] args) {
        Book[] books = new Book[3]; // creates an array of 3 null objects
        System.out.println(Arrays.toString(books)); 
        
        books[0] = new Book();
               books[0].title = "Java Fundamentals";
               books[0].author = "John";
               books[0].yop = 2001;
               books[0].genre = "Programming";
               books[0].pageCount = 298;
        books[1] = new Book();
               books[1].title = "Python Fundamentals";
               books[1].author = "John";
               books[1].yop = 2001;
               books[1].genre = "Programming";
               books[1].pageCount = 298;
        books[2] = new Book();
               books[2].title = "Html Fundamentals";
               books[2].author = "John";
               books[2].yop = 2001;
               books[2].genre = "Programming";
               books[2].pageCount = 298;
        // System.out.println(Arrays.toString(books)); 

        // print the books
        for (Book book : books) {
            System.out.print("\n"+ book.title +" - "+book.author +" - "+book.yop +" - "+book.genre +" - "+ book.pageCount +" - ");
        }


     }

}
