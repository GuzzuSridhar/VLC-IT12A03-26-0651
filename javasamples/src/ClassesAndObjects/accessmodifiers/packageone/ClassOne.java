package ClassesAndObjects.accessmodifiers.packageone;

@SuppressWarnings("unused")
public class ClassOne {
    private int privateField;
    public int publicField;
    int defaultField;
    protected int protectField;

    public static void main(String[] args) {
        // tryint access the instance fields in the same class
        ClassOne cone = new ClassOne();
        cone.privateField = 10;
        cone.publicField = 10;
        cone.defaultField = 10;
        cone.protectField = 10;
    }
}

// Syntax
// <access_modifier> type <identifier>

// if accessmodifier is ignored, then it is considered to be "default"