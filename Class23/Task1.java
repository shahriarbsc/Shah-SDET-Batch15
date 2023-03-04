package Class23;

import java.util.concurrent.Callable;

public class Task1 {

    //Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate interest based on the given balance.
    //Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    //Call the method by creating an object of each of the three classes.
    /*
    String
    Scanner
    StringBuffer
    Math   = check the java developer used
     */

    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(100, 10);
        creditCard.calculateInterest();
        Visa visa = new Visa(10, 10);
        visa.calculateInterest();
        AX ax = new AX(10, 10);
        ax.calculateInterest();

    }
}

class CreditCard {

    double balance;
    double interest;

    public CreditCard(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;

    }

    public void calculateInterest() {
        System.out.println("Interest " + (balance * interest) / 100);
    }
}

class Visa extends CreditCard {
    public Visa(double balance, double interest) {
        super(balance, interest);

    }
}

class AX extends CreditCard {
    AX(double balance, double interest) {

        super(balance, interest);
    }

    public void calculateInterest() {
        System.out.println("Interest " + (balance * interest / 100) + 30);

    }
}

