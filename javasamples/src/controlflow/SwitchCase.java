package controlflow;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a day of the week(1-7): ");
        int dow = input.nextInt();
        switch(dow){
            case 1: 
                System.out.println("Monday");
                break; // exit the switch
            case 2: 
                System.out.println("Tuesday");
                break;
            case 3: 
                System.out.println("Wednesday");
                break;
            case 4: 
                System.out.println("Thursday");
                break;
            case 5: 
                System.out.println("Friday");
                break;
            case 6: 
                System.out.println("Saturday");
                break;
            case 7: 
                System.out.println("Sunday");
                break;
            default: 
                System.out.println("Invalid Entry");
                break;
        }

        switch(dow){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Working Day");
                break;
            case 6:
            case 7:
                System.out.println("Week End");
                break;
            default:
                break;
        }

        // when (patter matching) in switch case available from Java 21
        Integer num = -10 ;

        switch(num){
            case Integer x when x < 0 ->
                System.out.println("Negative Value");
            case Integer x when x > 0 ->
                System.out.println("Positive Value");
            case Integer x when x == 0 ->
                System.out.println("Zero");
            default ->
        System.out.println("");

        }

        input.close();
    }

}
