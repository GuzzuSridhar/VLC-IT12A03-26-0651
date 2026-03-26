package ClassesAndObjects;

public class Blocks {
    // blocks in a class
    // static block
        // called only once 
        // multiple static blocks are allowed
        
        // instance block
        // run once per instance
        // multiple instance blocks are allowed
    
    static{
        System.out.println("Static block called");
    }
    static{
        System.out.println("Static block 1 called");
    }
    
    {
        System.out.println("instance block called");

    }
    {
        System.out.println("instance block 1 called");

    }

}
