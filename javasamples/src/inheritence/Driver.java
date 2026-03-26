package inheritence;

public class Driver {
    public static void main(String[] args) {
    Parent p = new Parent();
    p.greet();
    p.parentMethod();

    Child c = new Child();
    c.greet();
    c.parentMethod();

    GrandChild gc = new GrandChild();
    gc.greet();
    gc.parentMethod();
}
}
