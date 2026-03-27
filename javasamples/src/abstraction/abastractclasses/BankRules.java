package abstraction.abastractclasses;

public abstract class BankRules {
// Can have both concrete and abstract methods
    public abstract int setInterest(); // abstract method
    
    public boolean isValidCustomer(String nric){  // concrete method
        // check nric
        return true;
    }

}
