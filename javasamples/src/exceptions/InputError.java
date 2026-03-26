package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputError {
    public static void main(String[] args) {
        int age=0;
        boolean isInputValid = false;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age: ");
        while(!isInputValid){
            try{
            age = scan.nextInt();
            isInputValid = true;
            } catch(InputMismatchException i ){
                System.out.println("Invalid Entry please try again");
                scan.nextLine();
            }
        }   
        System.out.println("you are " + age + " years old");
        scan.close();

    }

}
