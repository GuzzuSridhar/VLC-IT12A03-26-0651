package controlflow;

public class WhileVsDoWhile {
public static void main(String[] args) {
    int i = 20;
    while(i<11){  // loop is not executed
        System.out.print(i++ + " ");
    }

    System.out.println();

    i =20;
    do{ // one iteration of loop is executed 
        System.out.print(i++ + " ");
    }while(i<11);
}
}
