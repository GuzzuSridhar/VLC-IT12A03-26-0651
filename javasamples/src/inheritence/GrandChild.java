package inheritence;

public class GrandChild extends Child { // multilevel inheritence
// Constructor
    GrandChild(){
        System.out.println("GrandChild constructor called");
    }

    // Method
    @Override
    void greet(){
        System.out.println("Hello from GrandChild");
    }
}
