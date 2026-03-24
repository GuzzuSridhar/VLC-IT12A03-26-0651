package basics;

import java.util.Scanner;

public class UserInput {
public static void main(String[] args) {
    Scanner scan  = new Scanner(System.in); // obtain scanner object
    
    // reading a String from command line
    System.out.print("Enter your name: ");
    String name = scan.nextLine();
    
    // readin an Integer
    System.out.print("Enter your Age: ");
    int age = scan.nextInt();

    // readin an double
    System.out.print("Enter your Salary: ");
    double sal = scan.nextDouble();
    System.out.println("Welcome! " + name + " you are " + age + " years old," + " Earning $" + sal);
    




}
}
