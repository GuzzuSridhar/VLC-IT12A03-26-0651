package controlflow;

public class BreakAndContinue {
    public static void main(String[] args) {
        // break statement
        for (int i = 0; i <10; i++) {
            System.out.print(i + " ");
            if(i == 5)
                break; // exit the loop at this line of execution
        }

        System.out.println();

        // continue statement
        for (int i = 0; i <10; i++) {
            if(i == 5)
                continue; // exit this iteration of loop and continue to next iteration
            System.out.print(i + " ");
        }
    }

}
