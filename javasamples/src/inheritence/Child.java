package inheritence;

public class Child extends Parent {

    // Constructor
    Child(){
        System.out.println("Child constructor called");
    }

    // Method
    @Override
    void greet(){
        System.out.println("Hello from Child");
    }

}
