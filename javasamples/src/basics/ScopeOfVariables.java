package basics;

public class ScopeOfVariables {

    // class variables (static variables)
    // scope = across all objects (Shared)
    // auto initialized
    static String schoolName = "xyz";
    
    
    // variables declared outside any method are instance variables
    // scope is per object (Each instance will have its own value)
    // auto initialized
    String name; // instance variables
    int age; //

    public void add(){
        // variables declared inside a method are local
        // scope : within the method
        // has to be initialized before use
        int num = 10; // local variable
    }

    public static void main(String[] args) {
        
    }

}
