package controlflow;

public class Conditions {
    public static void main(String[] args) {
        // 2 types of conditional statements
        // if-then-else
            // switch statement
        
        // if statement
        String name = "John", dept = "Sales";
        double salary = 9000;
        double com = 1000;

        // System.out.println(dept == "Sales");
        
        if(dept.equalsIgnoreCase("sales") && salary < 10000 ){
            System.out.println("below average salary"); // conditionally executed
        }
        // slse if statement
        else if(dept.equalsIgnoreCase("IT") && salary < 70000){
            }
        // else statement
        else{
            System.out.println("above average salary"); // conditionally executed
        }
        System.out.println("outside condition"); // not conditionally executed

        // simple if
        if(salary >10000){
            System.out.println("Good");
        }else if(salary > 5000 && salary < 1000){
            System.out.println("avg");
        }else{
            System.out.println("BAD");
        }

        
    }
}

