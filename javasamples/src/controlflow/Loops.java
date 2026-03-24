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
        
        System.out.println("Reverse numbers");
        while(loopvar >1){
            System.out.print(--loopvar + " ");
        }
        System.out.println("\n"+ loopvar + " after the loop ");
        
        System.out.println("------------------------do while-------------- " );


        //------------------------ Do While Loop---------------

        do{
            System.out.println(loopvar);
            loopvar++;
        }while(loopvar < 11);

        System.out.println("------------------------for-------------- " );
        // for loop
        // 3 parameter of a loop are in a single line
        for(int i =1; i < 11; i++){
            System.out.println(i);
        }

        


    }

}
