package abstraction.abastractclasses;

public class MayBank extends BankRules {

    @Override
    public int setInterest() {
        return 5;
    }

    public static void main(String[] args) {
        MayBank mayBank = new MayBank();
        System.out.println("The interest rate of MayBank is " + mayBank.setInterest());
    }

}
