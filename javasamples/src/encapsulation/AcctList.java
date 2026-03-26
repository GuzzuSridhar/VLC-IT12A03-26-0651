package encapsulation;

public class AcctList {
    public static void main(String[] args) {
        BankAcct bankAcct = new BankAcct();
        BankAcct bankAcct2 = new BankAcct(101, "John", 888, "Savings");

        // bankAcct.acctId = 100 // not allowed as it is a private member

        bankAcct.setAcctId(100);
        bankAcct.setAccName("Alex");
        bankAcct.setBalance(152);
        bankAcct.setAcctType("Current");



        // read object info
        System.out.println(bankAcct);
        System.out.println(bankAcct2);


        // System.out.println(
        //         bankAcct.getAcctId() +" - " +
        //         bankAcct.getAccName() +" - " +
        //         bankAcct.getBalance() +" - " +
        //         bankAcct.getAcctType() 
        //     );
        // System.out.println(
        //         bankAcct2.getAcctId() +" - " +
        //         bankAcct2.getAccName() +" - " +
        //         bankAcct2.getBalance() +" - " +
        //         bankAcct2.getAcctType() 
        //     );

    

    }
}
