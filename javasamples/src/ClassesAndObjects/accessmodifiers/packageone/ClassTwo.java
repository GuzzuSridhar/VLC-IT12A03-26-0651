package ClassesAndObjects.accessmodifiers.packageone;

public class ClassTwo {
        public static void main(String[] args) {
        // tryint access the instance fields in the different class same package
        ClassOne cone = new ClassOne();
        // cone.privateField = 10; // access denied outside the class in which it is defined
        cone.publicField = 10;
        cone.defaultField = 10;
        cone.protectField = 10;
    }
}
