package records;

public class Driver {
    public static void main(String[] args) {
        BankAcct a1 = new BankAcct(100,"John",100,"Savings");
        BankAcct a2 = new BankAcct(100,"John",100,"Savings");
        BankAcct a3 = new BankAcct(100,"John",100,"Savings");

        // printing records using accessor methods (just like the getter methods)
        System.out.println(
            a1.acctId()+ " - " 
            +a1.accName()+ " - "
            +a1.balance()+ " - "
            +a1.accType()+ " - "
        );

        System.out.println(
            a2.acctId()+ " - " 
            +a2.accName()+ " - "
            +a2.balance()+ " - "
            +a2.accType()+ " - "
        );

        // using the implicitly overriden toString() method
        System.out.println(a3);
        
    }
}
