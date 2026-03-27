package abstraction.interfaces;

public interface Mas {

    void welcome(String User); // abstract method

    default void  someAction(int x){ // default methods are concrete
        System.out.println();
    }

    // static method are concrete methods
    static boolean closeAcct(int acctNo){
        System.out.println("Account "+ acctNo + " is Closed");
        return true;
    }

}
