package enums;

public class Main {
    public static void main(String[] args) {
        BankAcct a1 = new BankAcct("Alex", AccountType.SAVINGS);
        BankAcct a2 = new BankAcct("Alex", AccountType.CURRENT);
        BankAcct a3 = new BankAcct("Alex", AccountType.CREDIT);
        //BankAcct a4 = new BankAcct("Alex", "CREDIT"); // not allowed

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
