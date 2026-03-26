package methods;

public class MethodDemo {

    /*
        Syntax: (Signature)
        [<Access-Modifier>] [static] [final] <return-type> <method-name>([parameters])
        
        Access modifier is optional and can be one of 
        1. private
        2. public
        3. blank (default)
        4. protected

        static keyword
        if mentioned the method is a class method and can be accessed without any instances
        
        final keyword
        if mentioned the method cannot be overriden

        return type
        what type the method will return ? if nothing is returned then it will be "void"

        method name
        use Camel casing
        
        parameters
        there can be zero or more parameters (araguments)

        Notes:
        return statement (if present), will be the last statement to get executed 
        There can be zero or more methods per class
        Main method is the entry point to a class (optional)
        two types of methods
        1. Instance method
        2. Static method

    */

        //  [<Access-Modifier>] [static] [final] <return-type> <method-name>([parameters])
        // declare instance method with only required aspects
        void greet(){
            System.out.println("Welcome");
            // no return statement needed as the return type is void
        }

        // method with return type of a int no parameters
        int add(){
            // System.out.println("add");
            return 10+10; // return statement is mandatory
            // System.out.println("add"); // not allowed
        }

        // method with a return type and has parameters
        int product(int x, int y){
            return x*y;
        }

        public static void main(String[] args) {
            MethodDemo methodDemo = new MethodDemo();
            methodDemo.greet(); // calling a void method
            System.out.println(methodDemo.add()); // calling a method with a return statement
            int res = methodDemo.add(); // capture the returned value
            res++;
            System.out.println(res);
            res = methodDemo.product(10,10);
            System.out.println(res);



        }



}
