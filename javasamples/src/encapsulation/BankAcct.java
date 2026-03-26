package encapsulation;

public class BankAcct {
    // encapsulation needs all instance variables to be private
    private int acctId;
    private String accName;
    private float balance;
    private String acctType;

    // Constructor
    public BankAcct(int acctId, String accName, float balance, String acctType) {
        this.acctId = acctId;
        this.accName = accName;
        this.balance = balance;
        this.acctType = acctType;
    }

    public BankAcct(){}

    // getter and setter methods to access the private instance variables
    public int getAcctId() {
        // password logic
        return acctId;
    }

    public void setAcctId(int acctId) {
        // password logic
        this.acctId = acctId;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getAcctType() {
        return acctType;
    }

    public void setAcctType(String acctType) {
        this.acctType = acctType;
    }

    @Override
    public String toString() {
        return "acctId=" + acctId + ", accName=" + accName + ", balance=" + balance + ", acctType=" + acctType;
    }

    
    
}
