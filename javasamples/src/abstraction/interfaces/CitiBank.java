package abstraction.interfaces;

public class CitiBank implements Bank , Mas {

    @Override
    public double fdInterest(double depAmt, int period) {
        double roi = 3.5;
        double interestPaid = (depAmt *period *roi) /100;
        return interestPaid;
    }

    @Override
    public double rdInterest(double depAmt, int period) {
        double roi = 2.5;
        double interestPaid = (depAmt *period *roi) /100;
        return interestPaid;
    }

    void greet(String name){
        System.out.println("Welcome to CitiBank " + name);
    }

    public static void main(String[] args) {
        CitiBank citiBank  = new CitiBank();
        double amtDep = 900;
        double intAcc = citiBank.fdInterest(amtDep, 12);
        citiBank.welcome("John");
        System.out.println("For an amount of $" 
                        + amtDep 
                        + " for a period of 12 months " 
                        + " you will earn an interest of $"
                        + intAcc
                    );
    }

    @Override
    public void welcome(String User) {
        System.out.println("Welcome " + User);
    }

}
