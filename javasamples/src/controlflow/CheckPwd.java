package controlflow;

import java.util.Scanner;

public class CheckPwd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pass;
        do {
            System.out.print("Enter you password: ");
            pass = scan.next();
        } while (!(pass.equalsIgnoreCase("test")));
        System.out.println("Welcome");
        scan.close();
    }
}
