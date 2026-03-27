package abstraction.interfaces;

public class CitiBank implements Bank {

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

}
