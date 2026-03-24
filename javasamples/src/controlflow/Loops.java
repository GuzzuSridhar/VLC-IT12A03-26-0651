package controlflow;

public class Loops {
    // loop basics
    /*
    1. Loop Variable
    2. Exit condition
    3. loop iteration (increment / decement of loop variable)
     */
    public static void main(String[] args) {
        // while loop
        int loopvar = 1;
        while(loopvar<11){
            System.out.print(loopvar + " ");
            loopvar++;
        }
        System.out.println("\n"+ loopvar + " after the loop ");
        


    }

}
