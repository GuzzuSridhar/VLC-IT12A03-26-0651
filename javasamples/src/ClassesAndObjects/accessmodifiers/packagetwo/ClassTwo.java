package ClassesAndObjects.accessmodifiers.packagetwo;

import ClassesAndObjects.accessmodifiers.packageone.ClassOne;

public class ClassTwo {
    public static void main(String[] args) {
        // tryint access the instance fields in the  class of different package
        // ClassesAndObjects.accessmodifiers.packageone.ClassOne cone = new ClassesAndObjects.accessmodifiers.packageone.ClassOne();
        ClassOne cone = new ClassOne();
        //cone.privateField = 10; // access Denied
        cone.publicField = 10;
        //cone.defaultField = 10; //default is access denied
        //cone.protectField = 10; // access is denied
    }
}
