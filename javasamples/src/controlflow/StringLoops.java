package controlflow;

public class StringLoops {
    public static void main(String[] args) {
        // iterate through string cracters
        String test = "Hello";
        // while loop
        int lv = 0;
        while(lv < test.length()){
            System.out.print(test.charAt(lv++) + " ");
            
        }

        System.out.println("\n----------------------");
        
        // do while
        lv = 0;
        do{
            System.out.print(test.charAt(lv++) + " ");
        }while(lv < test.length());
        
        System.out.println("\n----------------------");
        // for loop
        for(int i = 0; i < test.length() ; i++){
            System.out.print(test.charAt(i) + " ");
        }
    }

}
